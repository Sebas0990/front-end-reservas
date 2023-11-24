package com.pagina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginaController {

    @RequestMapping("/pagina")
    public String pagina(){
        return "pagina";
    }

}
