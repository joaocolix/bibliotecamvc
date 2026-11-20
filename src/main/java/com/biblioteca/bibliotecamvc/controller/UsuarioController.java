package com.biblioteca.bibliotecamvc.controller;

import com.biblioteca.bibliotecamvc.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/inicio")
    public String inicio() {
        return "usuario/inicio";
    }

    @GetMapping
    public String mostrar(Model model) {
        Usuario usuario = new Usuario("João", "joao@email.com", "", "");
        model.addAttribute("usuario", usuario);
        return "usuario/inicio";
    }
}
