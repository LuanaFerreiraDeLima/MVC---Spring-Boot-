package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Roupa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/roupas")
public class RoupasAPI {

    public List<Roupa> roupas = new ArrayList<Roupa>();

    public RoupasAPI() {
        roupas.add(new Roupa ("10123", "Blusa", 45, 30));
        roupas.add(new Roupa ("25340", "Saia", 50, 45));
        roupas.add(new Roupa ("45870", "Calça", 100, 85));
        roupas.add(new Roupa ("00154", "Shorts", 55, 50));
    }

    @GetMapping
    public List<Roupa> getRoupass() {
        return roupas;
    }

}
