import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scan = new Scanner(System.in)){
		
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			
			int i, inteiros;
			
			for(i = 0; i < 7; i++) {
				System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
				inteiros = scan.nextInt();
				numeros.add(inteiros);
			}
			
			numeros.sort(null);
			
			Iterator<Integer> numerosInteiros = numeros.iterator();
			
			System.out.println("Lista ordenada de forma crescente:");
			while(numerosInteiros.hasNext()) {
				System.out.println(numerosInteiros.next());
			}
			
		}
		
	}

}
