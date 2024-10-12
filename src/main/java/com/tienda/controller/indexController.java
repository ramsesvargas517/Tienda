/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author XPC
 */
@Controller
public class indexController {
    
    @RequestMapping("/")
    public String paginaIncio(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
    
    @RequestMapping("/contacto")
    public String paginaContacto(Model model) {
        //model.addAttribute("attribute", "value");
        return "info";
    }
    
}
