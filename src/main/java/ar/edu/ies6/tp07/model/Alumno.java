package ar.edu.ies6.tp07.model;

public class Alumno {
/// crear los atributos
	
private String nombre;
private String apellido;
private String dni;
private String gmail;
private String edad;

//contructor por defecto
public Alumno() {
	// TODO Auto-generated constructor stub
}


// contructor por parametro: va si osi para poder cargar alumnos

public Alumno(String nombre, String apellido, String dni, String gmail, String edad) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.gmail = gmail;
	this.edad = edad;
}

//metodo Accesores
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
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getEdad() {
	return edad;
}
public void setEdad(String edad) {
	this.edad = edad;
}

////metodo de interfaz el to String
@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", gmail=" + gmail + ", edad="
			+ edad + "]";
}   



	

}
