package app.javajenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaJenkinsApp {

    public static void main(String[] args) {
        SpringApplication.run(JavaJenkinsApp.class, args);
    }

    @GetMapping
    public String get() {
        return "Welcome in Java Spring!";
    }

}
