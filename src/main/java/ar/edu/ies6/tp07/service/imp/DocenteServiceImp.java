package ar.edu.ies6.tp07.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Docente;
import ar.edu.ies6.tp07.service.IDocenteService;
import ar.edu.ies6.tp07.util.AlmacenDocente;

@Service
public class DocenteServiceImp implements IDocenteService{
	
	//Y AQUI COMO LO HACE

	@Override
	public void guardarDocente(Docente docente) {
		// TODO Auto-generated method stub
		AlmacenDocente.docente.add(docente);
		
	}

	@Override
	public void eliminarDocente(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarDocente(Docente modificarDocente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarDocente(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Docente> listarTodosDocente() {
		// TODO Auto-generated method stub
		return AlmacenDocente.docente;
	}
	
	// 
	
	//aqui en docente service solo contiene la lógica de 
	//negocio para manejar objetos Docente

	
	

	
}
