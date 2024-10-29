package ar.edu.ies6.tp07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.tp07.model.Materia;
import ar.edu.ies6.tp07.service.IMateriaService;

@Controller
public class MateriaController {
	//Crea la materia por unica vez 
	@Autowired
	Materia unaMateria;
	
	@Autowired 
	IMateriaService materiaService;
	
	//Gestiona el Acceso a la vista de la materia, lo llama
	@GetMapping("/materia")
	public ModelAndView getIndexWhithMateria() {
	
	                                                 //nombre del html
		ModelAndView transportador = new ModelAndView("materia"); 
		transportador.addObject("materia", unaMateria);
		
	return transportador;
	}
	
	//lo devuelve 
	@PostMapping("/gurdarMateria")
	public ModelAndView guardarMateria (Materia materia) {
		
	// Guarda la materia usando el servicio
	materiaService.guardarMateria(materia);
	
	// Transporte hacia la vista despues de guardar la materia
	ModelAndView transportador = new ModelAndView("listaMateria"); // llama al html 
	transportador.addObject("listadoMateria", materiaService.listarTodasMaterias());
	                         //la lista 
	return transportador;	

	}	
	

}
