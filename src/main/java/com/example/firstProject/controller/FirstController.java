package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("userName", "Taeyeong");
        return "greetings";
    }

    @GetMapping("bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickName", "Taeyoeng");
        return "goodBye";
    }

}
