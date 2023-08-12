package com.ventas.ecomerce.controller;

import com.ventas.ecomerce.model.Usuario;
import com.ventas.ecomerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("registro")
    public String create(){
        return "usuario/registro";
    }

    @PostMapping("save")
    public String save(Usuario usuario){
        System.out.println("usuario registro:  "+usuario);
        usuario.setTipo("USER");
     usuarioService.save(usuario);
        return "redirect:/";
    }

}
