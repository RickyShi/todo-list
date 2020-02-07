package academy.learnprogramming.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

//Controller is a special type for component for controller.
@Slf4j
@Controller
public class DemoController {

    /*http://localhost:8080/to*do-list/hello*/
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /*http://localhost:8080/to*do-list/welcome*/
    // 1st way to add model
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("user", "Kai");
        log.info("model={}", model);
        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }

    // end way to use annotation to add model
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return "Welcome to this Demo App.";
    }
}
