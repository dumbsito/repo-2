package com.example.dou;

import java.time.LocalDate;

import lombok.Data;

public class PetDTO {
 
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
	public boolean getVacunas() {
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
	long id;
	private String name;
	private String raza;
	private LocalDate Cumpleaños;
	boolean tienevacunas;
	private Gender gender;
	
	
}
