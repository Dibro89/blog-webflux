package blog.posts.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Post {

    @Id
    private long id;

    private long userId;

    private String text;
}
