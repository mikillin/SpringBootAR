package de.fhdo.arbe.components.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StartController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "application name");
        return "index";
    }
}
