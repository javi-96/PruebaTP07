package ar.edu.ies6.tp07.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class Docente {

//atributos de un docente
private String nombre;
private String apellido;
private String dni;
private LocalDate FechaNacimiento;
private Boolean estado;


// constructor por defecto
public Docente() {
	// TODO Auto-generated constructor stub
}



// contructor por parametros, si o si va. porq sino no nos permite cargar un docente
public Docente(String nombre, String apellido, String dni, String legajo, LocalDate FechaNacimiento, Boolean estado) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.FechaNacimiento = FechaNacimiento;
	this.estado = estado;
	
	
}




//metdosaccesores
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}



public LocalDate getFechaNacimiento() {
	return FechaNacimiento;
}



public void setFechaNacimiento(LocalDate fechaNacimiento) {
	FechaNacimiento = fechaNacimiento;
}





public Boolean getEstado() {
	return estado;
}



public void setEstado(Boolean estado) {
	this.estado = estado;
}


// metodo de interfaz
@Override
public String toString() {
	return "Docente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" 
			+ ", FechaNacimiento=" + FechaNacimiento + ", estado=" + estado + "]";
}









}



