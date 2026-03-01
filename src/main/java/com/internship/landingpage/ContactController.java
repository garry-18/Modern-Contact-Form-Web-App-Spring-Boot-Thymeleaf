package com.internship.landingpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ContactController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/submit")
    public String handleForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message,
            Model model) {

        System.out.println("New Contact Form Submission:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        System.out.println("-----------------------------");
        model.addAttribute("name", name);

        return "redirect:/";
    }
}