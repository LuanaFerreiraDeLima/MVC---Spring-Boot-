package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Roupa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/roupas")
public class RoupaController {

    public List<Roupa> roupas = new ArrayList<Roupa>();

    public RoupaController() {
        roupas.add(new Roupa ("10123", "Blusa", 45, 30));
        roupas.add(new Roupa ("25340", "Saia", 50, 45));
        roupas.add(new Roupa ("45870", "Calça", 100, 85));
        roupas.add(new Roupa ("00154", "Shorts", 55, 50));
    }

    @GetMapping
    public String getRoupas(Model model) {
        model.addAttribute("roupas", roupas);
        return "roupas";
    }
}