package ar.edu.ies6.tp07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioController {

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";  
    }
}