package br.com.senai.cadastro;

import br.com.senai.aluno.Aluno;
import br.com.senai.curso.Curso;

public class Cadastro {

	private Curso curso;
	private Aluno aluno;
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
