package blog.posts.repository;

import blog.posts.model.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PostRepository extends ReactiveCrudRepository<Post, Long> {

    Flux<Post> findByUserId(long userId);
}
