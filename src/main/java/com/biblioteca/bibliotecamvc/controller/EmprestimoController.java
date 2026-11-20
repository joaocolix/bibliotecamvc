package com.biblioteca.bibliotecamvc.controller;

import com.biblioteca.bibliotecamvc.model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final List<Emprestimo> emprestimos = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("emprestimos", emprestimos);
        return "emprestimos/lista";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return "redirect:/emprestimos";
    }
}
