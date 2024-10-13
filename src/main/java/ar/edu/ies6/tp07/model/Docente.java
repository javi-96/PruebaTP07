package ar.edu.ies6.tp07.model;

public class Docente {

//atributos de un docente
private String nombre;
private String apellido;
private String dni;
private String legajo;

// constructor por defecto
public Docente() {
	// TODO Auto-generated constructor stub
}



// contructor por parametros, si o si va. porq sino no nos permite cargar un docente
public Docente(String nombre, String apellido, String dni, String legajo) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.legajo = legajo;
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

public String getLegajo() {
	return legajo;
}

public void setLegajo(String legajo) {
	this.legajo = legajo;
}


//metodo de interfaz
@Override
public String toString() {
	return "Docente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo=" + legajo + "]";
}




}



