package br.com.senai.aluno;

import java.util.Calendar;

import br.com.senai.endereco.Cidade;

public class Aluno extends Cidade {

	private String nome;
	private int anoDeNascimento;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}

	
}
