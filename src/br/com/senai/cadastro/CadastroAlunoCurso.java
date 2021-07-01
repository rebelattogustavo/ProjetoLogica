package br.com.senai.cadastro;

import java.util.List;
import java.util.Scanner;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.curso.Curso;
import br.com.senai.curso.CursoController;

public class CadastroAlunoCurso {

	private Scanner tec;
	private CursoController cursoController;
	private AlunoController alunoController;
	
	public CadastroAlunoCurso() {
		
		Scanner tec = new Scanner(System.in);
		cursoController = new CursoController();
		alunoController = new AlunoController();
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public Cadastro cadastrarCA(List<Curso> cursos, List <Aluno> alunos) {
			
			if(cursos.isEmpty() || alunos.isEmpty()) {
				System.out.println("Impossível realizar vendas sem PRODUTOS  ou PESSOAS cadastradas.");
				return null;
			}
			
			cursoController.listarCursos(cursos);
			alunoController.listarAlunos(alunos);
			
			
			Cadastro cadastro = new Cadastro ();
			Curso curso = new Curso();
			Aluno aluno = new Aluno ();
			
			
			System.out.print("Informe o Id do curso: ");
			int idCurso = tec.nextInt() - 1;
			
			curso.setNomeDoCurso(cursos.get(idCurso).getNomeDoCurso());
			
			cadastro.setCurso(curso);
			
			
			System.out.print("Informe o Id do aluno: ");
			int idAluno = tec.nextInt() - 1;
			
			aluno.setNome(alunos.get(idAluno).getNome());
			aluno.setIdade(alunos.get(idAluno).getIdade());
			
			
			cadastro.setAluno(aluno);
			
			
			return cadastro;
		}
	
	public List<Cadastro> listarCadastros(List <Cadastro> cadastros) {
		
		System.out.println("--- CADASTROS REALIZADOS ---");
		
		System.out.printf("| %10s | %10s |\n",
				"Aluno", "Curso"
			);
		
		
		for(int i = 0; i < cadastros.size(); i++) {
			System.out.printf("| %10s | %10s |\n",
					cadastros.get(i).getAluno().getNome(),
					cadastros.get(i).getCurso().getNomeDoCurso()
					);
		}
		
		return cadastros;
	}
	
	public void menuCadastro(List <Cadastro> cadastros, List<Curso> cursos, List <Aluno> alunos) {
		System.out.println("--- MENU DE VENDA ---");
		System.out.println("1) Cadastrar venda");
		System.out.println("2) Listar venda");
		System.out.println("---------------------");
		System.out.print("Informe a opção desejada: ");
		
		int opcao = tec.nextInt();
		switch (opcao) {
		case 1:
			cadastros.add(cadastrarCA(cursos, alunos));
			break;
		
		case 2:
			listarCadastros(cadastros);
			
		default:
			System.out.println("Opção inválida");
			
		}
	
	
	
	}
		
}
