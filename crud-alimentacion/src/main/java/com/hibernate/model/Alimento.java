package com.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alimento")
public class Alimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idAlimento")
	private int idAlimento;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "grasas")
	private double grasas;

	@Column(name = "grasasSaturadas")
	private double grasasSaturadas;

	@Column(name = "hidratos")
	private double hidratos;

	@Column(name = "azucar")
	private double azucar;

	@Column(name = "proteinas")
	private double proteinas;

	@Column(name = "sal")
	private double sal;

	@Column(name = "calorias")
	private double calorias;

	public Alimento() {
		super();
	}

	public Alimento(String nombre, double grasas, double grasasSaturadas, double hidratos, double azucar, double proteinas,
			double sal, double calorias) {
		super();
		this.nombre = nombre;
		this.grasas = grasas;
		this.grasasSaturadas = grasasSaturadas;
		this.hidratos = hidratos;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
		this.calorias = calorias;
	}

	public int getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGrasas() {
		return grasas;
	}

	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}

	public double getGrasasSaturadas() {
		return grasasSaturadas;
	}

	public void setGrasasSaturadas(double grasasSaturadas) {
		this.grasasSaturadas = grasasSaturadas;
	}

	public double getHidratos() {
		return hidratos;
	}

	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	
	

}
