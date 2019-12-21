import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI2137 {
	public static void main(String[] args) throws IOException {

		
		int qtde;

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			ArrayList<String> livros = new ArrayList<String>();
			
			qtde = in.nextInt();

			for (int i = 0; i < qtde; i++) {
				livros.add(in.next());
			}

			Collections.sort(livros);

			for (int i = 0; i < qtde; i++) {
				System.out.println(livros.get(i));
			}
		}
	}
}
