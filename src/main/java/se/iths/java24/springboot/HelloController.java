package se.iths.java24.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    String hello(Model model){
        model.addAttribute("message", "Hello, World!");
        model.addAttribute("name","Martin");
        return "hello";
    }

}
