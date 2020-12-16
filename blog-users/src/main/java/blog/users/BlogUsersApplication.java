package blog.users;

import blog.users.model.User;
import blog.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BlogUsersApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogUsersApplication.class, args);
    }

    @Override
    public void run(String... args) {
        createUser(15, "nicytork");
        createUser(26, "urkenoas");
        createUser(29, "tineleto");
        createUser(32, "ickwatea");
        createUser(42, "tioryshm");
        createUser(51, "espiegan");
        createUser(53, "nainverv");
        createUser(67, "egamoger");
        createUser(73, "hmonlane");
        createUser(83, "ancediga");
    }

    private void createUser(int id, String username) {
        User john = new User();
        john.setId(id);
        john.setUsername(username);
        userRepository.save(john).subscribe();
    }
}
