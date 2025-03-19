import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(Scanner scan = new Scanner(System.in)){
		
		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
		
		int i, n, check;
		
		for(i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número: ");
			n = scan.nextInt();
			numerosInteiros.add(n);
		}
		
		System.out.println("Digite um número e checarei se está na lista: ");
		check = scan.nextInt();
		System.out.println("O número está na lista? " + numerosInteiros.contains(check)); 
	
	}
		
	}

}
