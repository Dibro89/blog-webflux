package blog.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserPostsController {

    private final WebClient webClient = WebClient.create();

    @GetMapping("/{userId}")
    public Mono<Map<String, Object>> getUserWithPosts(@PathVariable long userId) {
        Mono<Map<String, Object>> userMono = webClient.get()
                .uri("http://localhost:8081/users/{userId}", userId)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<>() {});
        Flux<Map<String, Object>> postFlux = webClient.get()
                .uri("http://localhost:8082/posts", uri -> uri.queryParam("user", userId).build())
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<>() {});
        return userMono.zipWith(postFlux.collectList(), (user, posts) -> {
            user.put("posts", posts);
            return user;
        });
    }
}
