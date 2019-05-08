package com.uca.capas.domain;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


public class Producto {
	
	@Size(message="Nombre de producto no puede ser mayor a 20 caracteres",max=20)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="Nombre de marca no puede ser mayor a 20 caracteres", max=20)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String marca;
	
	@Size(message="La longitud debe no debe de exceder los 20 caracteres",max=20)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@Size(message="La categoria no puede exceder las 20 caracteres",max=20)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String categoria;
	
	@DecimalMin(message="Precio no puede ser un numero negativo",value = "0.0")
	@NotNull(message="Este campo no puede estar vacio")
	private Float precio;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotNull(message="Este campo no puede estar vacio")
	private Date fecha;
	
	
	
	public Producto(String nombre, String marca, String descripcion, String categoria, Float precio, Date fecha) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fecha = fecha;
	}
	
	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio; 
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
