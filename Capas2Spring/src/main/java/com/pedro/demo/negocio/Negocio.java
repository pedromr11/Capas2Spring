/**
 * 
 */
package com.pedro.demo.negocio;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pedro.demo.consultaDatos.Datos;
import com.pedro.demo.consultaDatos.IDatos;

@Component
public class Negocio implements INegocio{
	
	@Autowired
	IDatos datos;
	@Override
	
	public double calculoMasa(String nombre) throws IOException {
		
		
		double peso;
		double altura;
		peso = Double.parseDouble(datos.consultaDatos(nombre).split("-")[1]);
		altura = Double.parseDouble(datos.consultaDatos(nombre).split("-")[2]);
		return peso/altura*100;
	}
}

