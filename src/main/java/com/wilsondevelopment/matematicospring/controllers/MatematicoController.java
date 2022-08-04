package com.wilsondevelopment.matematicospring.controllers;

import com.wilsondevelopment.matematicospring.models.Matematico;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/matematico")
public class MatematicoController {
    @GetMapping("/formaMatematico")
    public String navegarALaForma(Model model) {
        Matematico m = new Matematico();
        model.addAttribute("matematico", m );
        return "forma";
    }

    @PostMapping("/sumaNumeros")
    public String ejecutaLaSuma(@ModelAttribute("matematico") Matematico matematico, Model model) {
        Integer resultado = Integer.parseInt((matematico.getNum1()))+Integer.parseInt(matematico.getNum2());
        model.addAttribute("resultado", resultado.toString());
        return "resultado";
    }
}
