package se.iths.java24.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController {

    @RequestMapping("/error")

String error() {
        return "error";
    }

}
