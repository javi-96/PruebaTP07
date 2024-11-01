package ar.edu.ies6.tp07.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.tp07.model.Alumno;
import ar.edu.ies6.tp07.service.IAlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired

//gestiona el acceso a la vista
 //SpringBoot Springframework
	
@GetMapping ("/alumno") 
public ModelAndView getIndexWithAlumno () {
	
	//codigo
	//crea el alumno

	//Alumno unAlumno = new Alumno();
	//Patron del diseño SINGLETON
	//unAlumno.setNombre("judith");
    //unAlumno.setApellido("maizares");
    // unAlumno.setDni(368837418);
	//unAlumno.setGmail(maizares.marisel@gmail.com);
	//unAlumno.setFechaDeNacimiento(1992-07-06);
	//unAlumno.isEstado(true);
	
	//tranporte  hacia la Vista
	 ModelAndView transportador = new ModelAndView ("listaAlumno");
	transportador.addObject("alumno",unAlumno); //podria llamarlo directamente del almacen de alumnos pero treria problemas  //porque no sabemos que tiene el almacen, nos traeria un problema de segurida..entonces le dejamos al service que haga ese trabajo
	      
	return transportador;     
}


@PostMapping ("/alumno")
public ModelAndView guardarAlumno (Alumno alumno) {
	

			                                                //porque no sabemos que tiene el almacen, nos traeria un problema de segurida..entonces le dejamos al service que haga ese trabajo
			
	return transportador;	
		
}
}	*/

