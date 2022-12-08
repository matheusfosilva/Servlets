package br.com.sdconecta.manager.classes;

import java.time.LocalDate;

public class Empresa {

	private Integer id;
	private String nome;
	private Integer cnpj;
	private LocalDate data;

	public Empresa(Integer id, String nome, Integer cnpj, LocalDate data) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
