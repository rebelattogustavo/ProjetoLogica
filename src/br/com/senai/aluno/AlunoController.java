package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;

import br.com.senai.aluno.Aluno;
public class AlunoController {

	Scanner tec = new Scanner(System.in);
	
	
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	

	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("--- CADASTRAR ALUNO ---");
		System.out.print("Informe nome: ");
		tec.nextLine();
		
		System.out.print("Informe a idade: ");
		tec.nextInt();
		
		System.out.print("Informe o país: ");
		tec.nextLine();
		aluno.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe o nome do estado: ");
		tec.nextLine();
		aluno.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe o nome da cidade: ");
		tec.nextLine();
		aluno.setNomeDaCidade(tec.nextLine());
		
		return aluno;
	}
	public List<Aluno> listarAlunos(List<Aluno> alunos){
		if(alunos.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		
		System.out.printf("| %2s | %20s | %4s | %20s | %20s | %20s |  \n", "Id", "Nome", "Idade",
							"País",  "Nome do estado", "Nome da cidade");
		
		for(int i = 0; i < alunos.size(); i++){
		System.out.printf("| %2d | %20s | %4d | %20s | 20s | 20s | \n",
				i + 1,
				alunos.get(i).getNome(),
				alunos.get(i).getIdade(),
				alunos.get(i).getNomeDoPais(),
				alunos.get(i).getNomeDoEstado(),
				alunos.get(i).getNomeDaCidade());
				
		}
		return alunos;
	}
	
	public List<Aluno> editarAluno(List<Aluno> alunos) {
		
		Aluno aluno = new Aluno();
		listarAlunos(alunos);	
		
		if(alunos.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id do aluno para editar: ");
		int idAluno = tec.nextInt() - 1;
		
		
		System.out.println("|1) Nome do aluno");
		System.out.println("|2) Idade do aluno");
		System.out.print("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DO ALUNO ---");
			System.out.print("Informe o novo nome: ");
			tec.nextLine();
			aluno.setNome(tec.nextLine());
			
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			
			alunos.set(idAluno, aluno);
			
			break;
			
		case 2:
			System.out.println("--- EDITAR IDADE DO ALUNO ---");
			System.out.print("Informe a nova idade: ");
			tec.nextInt();
			aluno.set
		}
		return alunos;
	}	
}
