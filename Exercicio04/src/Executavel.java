import java.util.Scanner;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scan = new Scanner(System.in)){
			
			LinkedList<String> cidades = new LinkedList<String>();
			
			String cidade;
			int i;
			
			for(i = 0; i < 5; i++) {
				System.out.println("Nome da " + (i + 1) + "º cidade: ");
				cidade = scan.next();
				cidades.add(cidade);
			}
			
			cidades.remove(1);
			Iterator<String> exibirCidades = cidades.iterator();
			
			
			while(exibirCidades.hasNext()) {
				System.out.println(exibirCidades.next());
			}
			
			
			
		}
		
	}

}
