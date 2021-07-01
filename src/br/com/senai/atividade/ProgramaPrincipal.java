package br.com.senai.atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.cadastro.Cadastro;
import br.com.senai.cadastro.CadastroAlunoCurso;
import br.com.senai.curso.Curso;
import br.com.senai.curso.CursoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		List<Curso> cursos = new ArrayList<Curso>();
		List<Cadastro> cadastros = new ArrayList <Cadastro> ();
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		CadastroAlunoCurso cadastroAlunoCurso = new CadastroAlunoCurso();
		
		boolean sair = false;
	
		
		do {
			System.out.println("--- MENU PRICIPAL ---");
			System.out.println("1) Menu aluno");
			System.out.println("2) Menu curso");
			System.out.println("3) Menu cadastro");
			System.out.println("0) Sair");
			System.out.println("---------------------");
			System.out.print("Informe a opção que deseja: ");
			
			int opcao = tec.nextInt();  			
			switch(opcao) {
			case 1:
				alunoController.menuAluno(alunos);
				break;
			
			case 2:
				cursoController.menuCurso(cursos);
				break;
			
			case 3:
				cadastroAlunoCurso.menuCadastro(cadastros, cursos, alunos);
				break;
				
			case 0:
				sair = true;
				break;
		
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(!sair);
		
		System.out.println("Sistema finalizado!");
	}
	
}
