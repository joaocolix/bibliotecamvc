package com.biblioteca.bibliotecamvc.controller;

import com.biblioteca.bibliotecamvc.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private final List<Livro> livros = new ArrayList<>();

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("livros", livros);
        return "livros/lista";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Livro livro) {
        livros.add(livro);
        return "redirect:/livros";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice) {
        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
        }
        return "redirect:/livros";
    }
}
