package cl.modulo4;

import java.util.Date;

public class Mascota {
	
	private String nombre;
	private String raza;
	private int edad;
	private Date ultimaAtencion;
	
	public Mascota(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Date getUltimaAtencion() {
		return ultimaAtencion;
	}

	public void setUltimaAtencion(Date ultimaAtencion) {
		this.ultimaAtencion = ultimaAtencion;
	}
	

}
