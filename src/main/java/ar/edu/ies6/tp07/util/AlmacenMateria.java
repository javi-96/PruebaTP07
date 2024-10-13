package ar.edu.ies6.tp07.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ies6.tp07.model.Materia;

public class AlmacenMateria {

	public static void main(String[] args) {
		
		List<Materia> almacenMateria = new ArrayList<Materia>();
		
		almacenMateria.add(new Materia (" 01 ","-Internet -",  true, -20));
		almacenMateria.add(new Materia (" 02 ","-Conectividad -", true, -12));
		almacenMateria.add(new Materia (" 03 ","-Programación -", true, -15));
		almacenMateria.add(new Materia (" 04 ","-Ingles Tecnico -", false, -22));
	
		System.out.println("Lista de Materias:");
		for (Materia m : almacenMateria) {
			  System.out.println(m.getCodigo() + m.getNombre() + m.getEstado() + m.getCargaHoraria());
			  
        }
		
	
	
	}	
		
}
