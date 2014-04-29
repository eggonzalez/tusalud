package co.edu.usbcali.modelo;

// Generated 30/03/2014 11:58:29 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Personas generated by hbm2java
 */
public class Personas implements java.io.Serializable {

	private Long idPersona;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private String genero;
	private String profesion;

	public Personas() {
	}

	public Personas(Long idPersona, String primerNombre, String primerApellido,
			Date fechaNacimiento, String genero, String profesion) {
		this.idPersona = idPersona;
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.profesion = profesion;
	}

	public Personas(Long idPersona, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido,
			Date fechaNacimiento, String genero, String profesion) {
		this.idPersona = idPersona;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.profesion = profesion;
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProfesion() {
		return this.profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		
		return idPersona+","+primerNombre+","+segundoNombre+","+primerApellido+","+segundoApellido+","+fechaNacimiento+","+genero+","+profesion;
	}

}