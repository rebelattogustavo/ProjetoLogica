package br.com.senai.curso;

import java.util.List;
import java.util.Scanner;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.cadastro.Cadastro;



public class CursoController extends AlunoController {

	private Scanner tec;

	
	public CursoController() {
		Scanner tec = new Scanner(System.in);
	}
	
	public Curso cadastrarCurso() {
		Curso curso = new Curso();
		
		System.out.print("Informe nome do curso: ");
		tec.next();
		curso.setNomeDoCurso(tec.next());
		
		return curso;
			
	}
	
	public List<Curso> listarCursos(List<Curso> cursos){
			
			if(cursos.isEmpty()) {
				System.out.println("Não possui produtos cadastrados.");
				return null;
			}
			
			
			System.out.println("---PRODUTOS CADASTRADOS ---");
			
			System.out.printf("| %2s | %10s | \n","Id", "Nome");
			
			for(int i = 0; i < cursos.size(); i++){
				System.out.printf("| %2d | %10s |  \n",
				i + 1,
				cursos.get(i).getNomeDoCurso());
			
				
			}			
			return cursos;
		}
	
	public List<Curso> editarCurso(List<Curso> cursos) {
		
		Curso curso = new Curso();
		listarCursos(cursos);	
		
		if(cursos.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id do curso para editar: ");
		int idCurso = tec.nextInt() - 1;
		
		
			System.out.println("--- EDITAR O NOME DO CURSO ---");
			System.out.print("Informe o novo nome do produto: ");
			curso.setNomeDoCurso(tec.next());
			
			curso.setNomeDoCurso(cursos.get(idCurso).getNomeDoCurso());
			
			
			cursos.set(idCurso, curso);
			
			
		return cursos;
	}
	
	public void excluirCurso(List<Curso> cursos) {
		
		listarCursos(cursos);
		
		if(cursos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO---");
		
		System.out.print("Informe o id do produto para excluir: ");
		int idCurso = tec.nextInt() - 1;
		
		if(cursos.size() <= idCurso) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		
		cursos.remove(idCurso);
	}
	
	public void menuCurso(List<Curso> cursos) {
		System.out.println("1) Cadastrar curso");
		System.out.println("2) Listar cursos");
		System.out.println("3) Editar curso");
		System.out.println("4) Excluir curso");
		System.out.println("--------------------");
		System.out.print("Informe a opção desejada: ");
		tec.nextInt();
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			cursos.add(cadastrarCurso());
			break;
		case 2:
			listarCursos(cursos);
			break;
		case 3:
			editarCurso(cursos);
			break;
		case 4:
			excluirCurso(cursos);
			break;
		default:
			System.out.println("Opção inválida");
		}
		
	}
	
}
