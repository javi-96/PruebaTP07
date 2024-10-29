package ar.edu.ies6.tp07.model;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	
	//Atributos
	private String codigo;
	private String nombre;
	private Boolean estado;
	private Integer cargaHoraria;
	private String año;
	
	
	//Contructor 
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Materia(String codigo, String nombre, Boolean estado, Integer cargaHoraria, String año) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.cargaHoraria = cargaHoraria;
		this.año = año;
			
	}



	//Metodos Accesores 
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	
	
	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", estado=" + estado + ", cargaHoraria="
				+ cargaHoraria + ", año=" + año +",]";
	}
	
	



	
	
	

}
