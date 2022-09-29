package com.example.dou;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="mascotas")
public class Pet {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	private String name;
	private String raza;
	private LocalDate Cumpleaños;
	boolean tienevacunas;
	private Gender gender;
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRaza() {
		return raza;
	}
	public LocalDate getCumpleaños() {
		return Cumpleaños;
	}
	public boolean isTienevacunas() {
		return tienevacunas;
	}
	public Gender getGender() {
		return gender;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setCumpleaños(LocalDate cumpleaños) {
		Cumpleaños = cumpleaños;
	}
	public void setTienevacunas(boolean tienevacunas) {
		this.tienevacunas = tienevacunas;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
