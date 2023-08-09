package com.ventas.ecomerce.controller;

import com.ventas.ecomerce.repository.ProductoRepository;
import com.ventas.ecomerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public  String home(Model model){
        model.addAttribute("productos",productoService.findAll());

        return "/usuario/home";
    }

    @GetMapping("productohome/{id}")
    public String productoHome(@PathVariable Integer id){
        System.out.println("imprimieno homeProducto, HomeController");
        return "usuario/productohome";
    }
}
