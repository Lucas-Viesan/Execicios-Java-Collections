import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;


public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(Scanner scan = new Scanner(System.in)){
		
		Queue <Paciente> listaPacientes = new LinkedList<Paciente>();
		
		String nome;
		int idade, opcao;
		boolean prioridade = true;
		
		while(true) {
		
		System.out.println("==================================");
		System.out.println("Escolha uma opção de pagamento");
		System.out.println("1- Adicionar Paciente");
		System.out.println("2- Chamar próximo Paciente(seguindo prioridade");
		System.out.println("3- Exbir fila de espera");
		System.out.println("==================================");	
		
		opcao = scan.nextInt();
		switch(opcao) {
		case 1: 
			System.out.println("Nome do Paciente: ");
			nome = scan.next();
			System.out.println("Idade: ");
			idade = scan.nextInt();
			
			if(idade >= 75) {
				prioridade = true;
			    System.out.println("Senha: Prioritária");
			} else {
				prioridade = false;
				System.out.println("Senha: Geral");
			}
			
			Paciente p1 = new Paciente(nome, idade, prioridade);
			
			listaPacientes.add(p1);
			
			break;
			
		case 2: 
			
			Iterator <Paciente> chamarPaciente = listaPacientes.iterator();		
			
			while(chamarPaciente.hasNext()) {
				if(chamarPaciente.next().isPrioridade()) {
					chamarPaciente.remove(); 	
				}
		  	}
			break;
	
		case 3:
			Iterator <Paciente> listar = listaPacientes.iterator();	
			
			if(!listar.hasNext()) {
				System.out.println("Não há senhas à espera!");
			} else {
				while(listar.hasNext()) {
					System.out.println(listar.next());
					}
			}
			
		break;
		default:
		        System.out.println("Opção inválida!");	
		 
				}

		
			}
		
		}
	
	}
		
}


