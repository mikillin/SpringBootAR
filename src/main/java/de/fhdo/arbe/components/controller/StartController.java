package de.fhdo.arbe.components.controller;


import de.fhdo.arbe.components.bean.Equipment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class StartController {

    @GetMapping("/")
    public String home(Model model) {

        List<Equipment> cameras = new ArrayList<>();
        cameras.add(new Equipment(1L, "Camera Internal", "Laptop 1", "Die Kamera vom Laptop", true));
        cameras.add(new Equipment(2L, "Camera External", "5px", "Die USB-Kamera ", false));

        model.addAttribute("name", "application name");
        model.addAttribute("cameras", cameras);
        model.addAttribute("model", "Mikrokontroller");
        return "index_v";
    }
}
