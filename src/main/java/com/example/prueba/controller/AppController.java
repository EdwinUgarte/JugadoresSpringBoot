package com.example.prueba.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.prueba.services.IService;


@Controller
@RequestMapping("/app")

public class AppController {
    
    @Autowired
    private IService service;

    @GetMapping("/jugadores")
    public String jugadores(Model model){
    model.addAttribute("titulo", "jugadores");
    model.addAttribute("jugadores", service.futbolistas());
    return "index";
    }


}
