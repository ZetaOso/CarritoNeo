package Entidades;

import java.time.LocalDateTime;

public class Persona {

private String name;
private String apellido;
private Carrito carrito;
private LocalDateTime fechaDeNac;

	public  Persona(String name, String apellido, LocalDateTime fechaDeNac, Carrito carrito) {
		this.name = name;
		this.apellido = apellido;
		this.fechaDeNac = fechaDeNac;
		this.carrito = carrito;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaDeNac() {
		return fechaDeNac;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setFechaDeNacimiento(LocalDateTime fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}

}
