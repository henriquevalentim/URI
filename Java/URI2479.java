import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI2479 {
	public static void main(String[] args) throws IOException {

		int qtde,positivo = 0,negativo = 0;
		String opcao;

		Scanner in = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();

		qtde = in.nextInt();
		for (int i = 0; i < qtde; i++) {
			opcao = in.next();
			
			if(opcao.equals("+")) {
				positivo++;
			}else if(opcao.equals("-")) {
				negativo++;
			}
				
			nomes.add(in.next());
		}
		
		Collections.sort(nomes);

		for (int i = 0; i < qtde; i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println("Se comportaram: " + positivo+" | Nao se comportaram: "+negativo);
	}
}
