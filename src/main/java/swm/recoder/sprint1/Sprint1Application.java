package swm.recoder.sprint1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Sprint1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sprint1Application.class, args);
    }

}
