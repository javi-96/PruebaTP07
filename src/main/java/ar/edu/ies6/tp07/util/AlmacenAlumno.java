package ar.edu.ies6.tp07.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ies6.tp07.model.Alumno;

/**
 * 
 */
public class AlmacenAlumno {
	
	public static void main(String[] args) {
		
		List<Alumno> alumno = new ArrayList<Alumno>(); 
		
		// Crear cuatro alumnos
		  
	   alumno.add (new Alumno (" Juan ", " Perez ", "- 36837418 "," - jaunprb@gmail.com ","- 20 "));

	   alumno.add (new Alumno(" María ", " Gómez ", "-87654321"," -maria.gomez@gmail.com", "-22"));
	   
	   alumno.add ( new Alumno(" Carlos ", " López ", "-11223344"," -carlos.lopez@gmail.com", "-21"));
	   
	   alumno.add ( new Alumno(" Ana ", " Martínez ", "-44332211"," -ana.martinez@gmail.com", "-19"));

	
	   System.out.println(" Lista de alumno ");
	   for (Alumno a : alumno ) {
		   System.out.println(a.getNombre() + a.getApellido() + a.getDni() + a.getGmail() + a.getEdad());
	   
	}
	}
	}

   


