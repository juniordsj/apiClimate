package br.com.eliel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pluviometro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String precipitacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrecipitacao() {
		return precipitacao;
	}
	public void setPrecipitacao(String precipitacao) {
		this.precipitacao = precipitacao;
	}
	
	
}
