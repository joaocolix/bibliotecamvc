package com.biblioteca.bibliotecamvc.controller;

import com.biblioteca.bibliotecamvc.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {

    private final List<Autor> autores = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("autores", autores);
        return "autores/lista";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Autor autor) {
        autores.add(autor);
        return "redirect:/autores";
    }
}
