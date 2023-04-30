package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="registrar")
public class registrar {
	@Id	
	@Column(name="iddocente")
	private int iddocente;
	@Column(name="nombre")
	private String  nombre;
	@Column(name="dni")
	private String  dni;
	@Column(name="fechaNacimiento")
	private String fechaNacimiento;
	@Column(name="sueldo")
	private String  sueldo;
	@Column(name="email")
	private String email;
	@Column(name="sexo")
	private String sexo;
	@Column(name="categoria")
	private String categoria;
	
	public registrar() {
		
	}

	public registrar(int iddocente, String nombre, String dni, String fechaNacimiento, String sueldo, String email,
			String sexo, String categoria) {
		super();
		this.iddocente = iddocente;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
		this.email = email;
		this.sexo = sexo;
		this.categoria = categoria;
	}

	public int getIddocente() {
		return iddocente;
	}

	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
