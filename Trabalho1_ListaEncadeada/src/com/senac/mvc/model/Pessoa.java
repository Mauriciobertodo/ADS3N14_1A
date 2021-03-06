package com.senac.mvc.model;

public class Pessoa implements Comparable<Pessoa> {

	String nome;
	String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int compareTo(Pessoa aPessoa) {
		return nome.compareTo(aPessoa.getNome());
	}
}
