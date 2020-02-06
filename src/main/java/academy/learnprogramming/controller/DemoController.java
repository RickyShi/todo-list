package academy.learnprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controller is a special type for component for controller.
@Controller
public class DemoController {

    /*http://localhost:8080/to*do-list/hello*/
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
