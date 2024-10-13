package ar.edu.ies6.tp07.util;

import java.util.ArrayList;  //se importo est
import java.util.List;

import ar.edu.ies6.tp07.model.Docente;

public class AlmacenDocente {
	
	public static void main(String[] args) {
		
		List<Docente> docentes = new ArrayList<Docente>();

		docentes.add(new Docente("Leonela ","Choque ","23334453 "," 01"));
		docentes.add(new Docente("Javier ","Choque ","3955456 "," 02 "));
		docentes.add(new Docente("Judith ","Maizares ","3938449 "," 03 "));
		docentes.add(new Docente("Elisa ","Liquitay ","39202293 "," 04 "));

		System.out.println("Docentes");
		for (Docente a : docentes) {
			
			System.out.println(a.getNombre()+a.getApellido()+a.getDni()+a.getLegajo());
			
		}
		



		
		
	}



}
