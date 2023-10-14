package com.francaemp.project.cadastropessoa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pessoas")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	private String nome;
	private Integer idade;

	private String password;
	
	public Pessoa () {
	}

	public Pessoa(String nome, Integer idade, String password) {
		this.nome = nome;
		this.idade = idade;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
