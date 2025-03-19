import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(Scanner scan = new Scanner(System.in)){
			
			ArrayList<String> cores = new ArrayList<String>();
			
			String cor;
			
			int i;
			
			for(i = 1; i < 6; i++) {
				System.out.println("Digita a " + i + "º cor: ");
				cor = scan.next();
				cores.add(cor);
			}
			
			cores.remove(4);
			
			

			System.out.println("A lista atualizada - Removido 3º item");
			Iterator<String> exibirCores = cores.iterator();
			
			while(exibirCores.hasNext()) {
				System.out.println(exibirCores.next());
			}
		}
		
	}

}
