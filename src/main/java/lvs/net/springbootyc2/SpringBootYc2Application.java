package lvs.net.springbootyc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableMongoAuditing
@EnableSwagger2
@SpringBootApplication
public class SpringBootYc2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootYc2Application.class, args);
    }

}
