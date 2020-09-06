package pl.sda.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomePageController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
