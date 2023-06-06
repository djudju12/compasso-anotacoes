package myExApp.app.controllerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    // Expose path "/"
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDayiWorkout() {
        return "Run a hard 5k!";
    }

}
