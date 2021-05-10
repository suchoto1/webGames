package cz.uhk.pro3.draughts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class MainController {

    @GetMapping
    public String main() {
        return "/main";
    }

}

