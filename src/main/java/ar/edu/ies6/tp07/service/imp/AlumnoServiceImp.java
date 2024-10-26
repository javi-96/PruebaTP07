package ar.edu.ies6.tp07.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Alumno;
import ar.edu.ies6.tp07.service.IAlumnoService;
import ar.edu.ies6.tp07.util.AlmacenAlumno;
@Service
public class AlumnoServiceImp implements IAlumnoService {

	@Override
	public void guardarAlummno(Alumno alumno){
		// TODO Auto-generated method stub

	AlmacenAlumno.alumno.add(alumno);
		}
		
	
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
		return null;
	}

}