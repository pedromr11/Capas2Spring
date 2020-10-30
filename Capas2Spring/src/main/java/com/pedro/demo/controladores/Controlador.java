package com.pedro.demo.controladores;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pedro.demo.negocio.INegocio;

@Controller
public class Controlador {
	
	@Autowired
	INegocio masa;
	
	@RequestMapping("masa")
	public String calcularNumeroCoches(@RequestParam("nombre") String n, ModelMap model) throws IOException {
			
			double imc = masa.calculoMasa(n);
			
			model.addAttribute("d", imc);
			
			
			return "masa";
		}
	
}
