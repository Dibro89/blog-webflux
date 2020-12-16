package blog.posts.controller;

import blog.posts.model.Post;
import blog.posts.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @GetMapping
    public Flux<Post> getPosts(@RequestParam("user") Optional<Long> userId) {
        Flux<Post> ret;
        if (userId.isPresent()) {
            ret = postRepository.findByUserId(userId.get());
        } else {
            ret = postRepository.findAll();
        }
        return ret.delaySubscription(Duration.ofSeconds(3));
    }

    @GetMapping("/{id}")
    public Mono<Post> getPost(@PathVariable long id) {
        return postRepository.findById(id);
    }
}
