package org.cisco505.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("We are in home controller");
        return "index";
    }
}
