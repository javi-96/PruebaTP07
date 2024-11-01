package ar.edu.ies6.tp07.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.ies6.tp07.model.Alumno;

public interface AlumnoRepository extends CrudRepository <Alumno, String> {

}
