package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;


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
		aluno.setNome(tec.next());
		
		System.out.print("Informe a idade: ");
		aluno.setIdade(tec.nextInt());
		
		System.out.print("Informe o país: ");
		aluno.setNomeDoPais(tec.next());
		
		System.out.print("Informe o nome do estado: ");
		aluno.setNomeDoEstado(tec.next());
		
		System.out.print("Informe o nome da cidade: ");
		aluno.setNomeDaCidade(tec.next());
		
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
			aluno.setIdade(alunos.get(idAluno).getIdade());
			
			alunos.set(idAluno, aluno);
			
			break;
			
		case 2:
			System.out.println("--- EDITAR IDADE DO ALUNO ---");
			System.out.print("Informe a nova idade: ");
			tec.nextInt();
			aluno.setIdade(tec.nextInt());
		
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			aluno.setNome(alunos.get(idAluno).getNome());
			
		}
		return alunos;
	}	
	
	public void excluirAluno(List<Aluno> alunos) {
			
			listarAlunos(alunos);
			
			if(alunos.isEmpty()) {
				return;
			}
			
			System.out.println("--- EXCLUIR ALUNO ---");
			
			System.out.print("Informe o id do aluno para excluir: ");
			int idAluno = tec.nextInt() - 1;
			
			if(alunos.size() <= idAluno) {
				System.out.println("Aluno não cadastrado.");
				return;
			}
			
			alunos.remove(idAluno);
		}
	
	
	
	public void menuAluno(List<Aluno> alunos) {
		System.out.println("--- MENU ALUNOS ---");
		System.out.println("1) Cadastrar aluno");
		System.out.println("2) Listar aluno");
		System.out.println("3) Editar aluno");
		System.out.println("4) Excluir aluno");
		System.out.println("--------------------");
		System.out.print("Informe a opção que deseja: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			alunos.add(cadastrarAluno());
			break;
		case 2: 
			listarAlunos(alunos);
			break;
		case 3: 
			editarAluno(alunos);
			break;
		case 4:
			excluirAluno(alunos);
			break;
		default:
			System.out.println("Opçao inválida");
			break;
	}
}
}
