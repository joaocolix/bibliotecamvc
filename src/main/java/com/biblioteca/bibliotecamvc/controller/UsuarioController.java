package com.biblioteca.bibliotecamvc.controller;

import com.biblioteca.bibliotecamvc.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", usuarios);
        return "usuarios/lista";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Usuario usuario) {
        usuarios.add(usuario);
        return "redirect:/usuarios";
    }
}
