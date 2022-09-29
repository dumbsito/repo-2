package com.example.dou;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceException extends RuntimeException {

	private String recurso,camponombre;
	private long campovalor;

	public ResourceException(String recurso, String camponombre, Long campovalor) {
		super(String.format("%s not found with %s : %s",recurso,camponombre,campovalor));
		this.recurso = recurso;
		this.camponombre = camponombre;
		this.campovalor = campovalor;
	}

	public String getRecurso() {
		return recurso;
	}

	public String getCamponombre() {
		return camponombre;
	}

	public Long getCampovalor() {
		return campovalor;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public void setCamponombre(String camponombre) {
		this.camponombre = camponombre;
	}

	public void setCampovalor(Long campovalor) {
		this.campovalor = campovalor;
	}
}
