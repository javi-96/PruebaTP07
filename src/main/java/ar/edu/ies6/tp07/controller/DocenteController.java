package ar.edu.ies6.tp07.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.tp07.model.Docente;
import ar.edu.ies6.tp07.service.IDocenteService;
import ar.edu.ies6.tp07.service.imp.DocenteServiceImp;

@Controller
public class DocenteController {

//aqui lo primero que hace es instanciar por unica vez a docente
@Autowired
Docente unDocente;

@Autowired
IDocenteService docenteService;

//recibe laa petidicion docent

@GetMapping("/docente") 
public ModelAndView getIndexWithDocente () {
//Docente docente1 = new Docente (); //esto guarda un espacio en la memoria pero..
//docente1.setApellido("Liquitay");
//docente1.setNombre("Yanina");
//docente1.setDni("39202293");
//LocalDate fechaNacimiento = LocalDate.of(2023, 4, 5); // 3 de abril de 2023
//docente1.setFechaNacimiento(fechaNacimiento);
//docente1.setEstado(null);
//especifica la vista en el html
ModelAndView transportador = new ModelAndView("docente");
transportador.addObject("docente", unDocente);

return transportador;}

//luego que se cargan los datos viene por post
@PostMapping
public ModelAndView guardarDocente (Docente docente) {
	//Este método devuelve un objeto ModelAndView, que combina la vista 
	//(la página que se mostrará) y el modelo (los datos que se van a 
	//mostrar en la vista).
	
	
	
	//aqui creamos el servi y mandamos a guardar perroo es un problema asi que creamos una
	//inyeccion de dependencia
	//DocenteServiceImp docenteService = new DocenteServiceImp() ;
	docenteService.guardarDocente (docente);
	
	//aqui lista docente es la vista
	//listadoDocente es la lista
	ModelAndView transportador = new ModelAndView("listaDocentes");
	transportador.addObject("listadoDocentes", docenteService.listarTodosDocente()); //estamos llamando al almacen de docentes
	return transportador;



}


}
