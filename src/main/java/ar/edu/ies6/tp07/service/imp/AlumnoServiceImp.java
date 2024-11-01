package ar.edu.ies6.tp07.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Alumno;

import ar.edu.ies6.tp07.service.IAlumnoService;
import ar.edu.ies6.tp07.util.AlmacenAlumno;
@Service
@Qualifier("servicioAlumnoArrayList")


public class AlumnoServiceImp implements IAlumnoService {
	
	
	//AlmacenAlumno.alumno.add(alumno);
	//System.out.println(AlmacenAlumno.alumno.get(0).getDni());

		
	
	@Override
	public void eliminarAlumno(String dni){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarAlumno(Alumno alumnoModificado){
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alumno consultarAlumno(String dni){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> listarTodosAlumnos() {
		// TODO Auto-generated method stub
		//filtrar por alumnos con estado activo
		return AlmacenAlumno.alumno;
	}

	@Override
	public void guardarAlummno(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}
	}
