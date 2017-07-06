/**
 * Created by szaboz on 2017.07.06..
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class ServerApplication {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "home";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}


