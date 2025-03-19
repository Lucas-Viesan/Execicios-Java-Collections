import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(Scanner scan = new Scanner(System.in)){
	
		ArrayList <String> nomes = new ArrayList<String>();
		
		String usuario;
		int i;
		
		for(i = 1; i < 6; i ++) {
			System.out.println("Digite o " + i + "º nome: ");
			usuario = scan.next();
			nomes.add(usuario);
		}
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
		
	}

}
