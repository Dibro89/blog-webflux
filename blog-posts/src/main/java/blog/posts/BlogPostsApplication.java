package blog.posts;

import blog.posts.model.Post;
import blog.posts.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BlogPostsApplication implements CommandLineRunner {

    private final PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogPostsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        createPost(16, 15, "Sed congue nunc est, in scelerisque orci dapibus vitae. Class aptent taciti sociosqu ad l" +
                "itora torquent per conubia nostra, per inceptos himenaeos. Proin varius sapien quis ornare congue. P" +
                "roin facilisis viverra ante, posuere imperdiet sapien convallis et. Nam a cursus eros, nec mollis an" +
                "te. Ut id suscipit dui. Phasellus sed hendrerit nibh, ac laoreet elit. Duis sit amet rutrum dui, et " +
                "tincidunt urna. Praesent finibus massa ante, fermentum luctus justo venenatis vel.");
        createPost(24, 42, "Pellentesque tincidunt, justo ut pulvinar congue, enim nulla convallis mauris, venenatis " +
                "dignissim libero leo ut metus. Fusce ullamcorper at risus ac fermentum. Morbi pellentesque vestibulu" +
                "m justo, finibus commodo metus sollicitudin quis. Duis id lobortis nibh, ut ultricies elit. Praesent" +
                " eros leo, dictum blandit consectetur sit amet, volutpat ut quam. Aliquam ac mi ac urna tincidunt gr" +
                "avida. Nulla laoreet sapien quis arcu finibus, eu gravida dui feugiat. Vivamus nec finibus nibh. Eti" +
                "am tempor ultricies gravida. Maecenas facilisis non nunc non dignissim.");
        createPost(26, 29, "Ut lacinia massa id enim blandit tristique. Mauris malesuada consectetur gravida. Nulla u" +
                "ltrices sapien eget tincidunt ultricies. Aliquam neque purus, accumsan blandit blandit id, faucibus " +
                "et libero. Cras suscipit, nisi rutrum placerat pharetra, libero enim tincidunt est, sit amet efficit" +
                "ur urna ante id risus. Donec euismod in lectus ac aliquam. Duis pharetra libero sit amet feugiat con" +
                "gue. Nam lacinia diam mauris, ac condimentum justo rutrum sit amet. Sed quis ipsum vitae enim ullamc" +
                "orper laoreet.");
        createPost(34, 32, "Quisque eleifend purus ut mi viverra, sit amet iaculis quam sodales. Maecenas convallis a" +
                "rcu sed lacus sollicitudin placerat. Phasellus eget nulla tincidunt, fermentum lacus quis, tincidunt" +
                " enim. Quisque ultrices leo sit amet tempor venenatis. Cras sodales consequat mi. Sed et quam quis a" +
                "nte elementum fringilla. Proin quis sapien quis mi malesuada volutpat et ac nulla. Vestibulum interd" +
                "um nec diam eu porta. In tristique, nunc eu porta mattis, felis nulla tristique nulla, at elementum " +
                "mauris quam et lorem. Morbi sollicitudin erat vitae lectus molestie, bibendum molestie felis condime" +
                "ntum. In a diam lacus.");
        createPost(35, 42, "Nunc pretium elit non dictum iaculis. Aenean vel ipsum non quam tristique tristique eu ne" +
                "c justo. Vestibulum a urna nec urna eleifend convallis. Duis convallis, justo eu eleifend vehicula, " +
                "orci massa ornare libero, at pulvinar ligula ex sed odio. Donec luctus leo sit amet elit lobortis pu" +
                "lvinar. Curabitur nec elit tempus, volutpat nunc id, varius dui. Aenean elementum venenatis lacinia." +
                " Nam varius varius luctus. Pellentesque pellentesque semper tortor, ac viverra ante finibus quis. Su" +
                "spendisse sit amet aliquet velit. Nulla facilisi. Nullam tempor turpis sem, sed aliquet metus rutrum" +
                " sed. Donec ultricies nisi eget est hendrerit, eget blandit elit imperdiet. Duis in porttitor magna.");
        createPost(65, 51, "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; E" +
                "tiam commodo sem ut lorem vulputate fringilla. Integer et dui posuere, scelerisque justo nec, finibu" +
                "s sem. Sed arcu nunc, posuere quis sem eget, bibendum sollicitudin odio. Etiam a vehicula lacus. Nam" +
                " imperdiet volutpat nulla, nec commodo leo consectetur vel. Pellentesque id vehicula urna, sit amet " +
                "vestibulum leo. Ut vehicula, sem vitae mattis placerat, mauris magna interdum tellus, nec accumsan t" +
                "urpis ligula ac tortor. Ut vitae sem eget dui fermentum commodo. Donec eu enim enim. In aliquam augu" +
                "e mauris, quis tincidunt dolor cursus porta.");
        createPost(71, 53, "Duis vitae ex porta, venenatis neque non, vestibulum lacus. Ut mi elit, suscipit in imper" +
                "diet a, posuere non erat. Praesent pellentesque lacinia nunc vitae eleifend. Phasellus est ex, inter" +
                "dum ac dolor nec, gravida auctor enim. Maecenas maximus turpis sit amet nibh maximus, ac accumsan od" +
                "io dapibus. Duis molestie venenatis facilisis. Nam augue lectus, molestie quis mauris nec, interdum " +
                "rutrum sapien. Praesent ultrices ut risus id placerat. Vestibulum quam arcu, commodo vel convallis i" +
                "d, posuere in erat.");
        createPost(74, 53, "Aenean bibendum porttitor mi, ut volutpat nisl pharetra at. Nunc vestibulum mi fringilla " +
                "leo iaculis maximus quis nec tellus. Duis id urna in nibh venenatis tristique in nec dolor. Sed at s" +
                "apien eros. Interdum et malesuada fames ac ante ipsum primis in faucibus. Praesent consequat dapibus" +
                " molestie. Aenean a venenatis quam. In ullamcorper tincidunt dignissim.");
        createPost(86, 42, "Ut tincidunt placerat nisl vitae congue. Cras ac nisi vel nisl pulvinar aliquet. Duis non" +
                " faucibus tellus. Sed et lectus nec purus aliquet posuere nec non ipsum. Duis in dui eu risus egesta" +
                "s laoreet. Donec ac lectus posuere, dignissim justo nec, maximus nisi. Vestibulum tempus ligula sit " +
                "amet enim accumsan aliquet. Ut in massa sed mi pulvinar feugiat ac nec diam. Mauris in eleifend risu" +
                "s, eu ornare est. In turpis dolor, consectetur eu dui sit amet, suscipit imperdiet nibh. Praesent se" +
                "d interdum purus. Etiam luctus nunc quis nulla hendrerit, a aliquam tortor sodales.");
        createPost(88, 51, "Maecenas non lectus nisi. Suspendisse potenti. Curabitur pulvinar eu lacus ut lobortis. P" +
                "raesent fermentum ipsum ante, vehicula cursus dolor hendrerit nec. Curabitur vulputate, nulla quis p" +
                "orta condimentum, mauris augue dignissim lacus, sed finibus eros dui sit amet dui. Fusce eleifend li" +
                "gula sed massa rhoncus, vel pulvinar nibh tristique. Aliquam non metus consectetur, laoreet dolor ve" +
                "l, blandit eros. Duis id diam vel ligula gravida ullamcorper vel elementum massa. Phasellus id imper" +
                "diet tortor, ac viverra risus. Morbi fringilla efficitur justo, ut blandit dolor eleifend id.");
    }

    private void createPost(long id, long userId, String text) {
        Post post = new Post();
        post.setId(id);
        post.setUserId(userId);
        post.setText(text);
        postRepository.save(post).subscribe();
    }
}
