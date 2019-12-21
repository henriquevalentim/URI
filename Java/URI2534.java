import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI2534 {
	public static void main(String[] args) throws IOException {

		
		int habitante, consulta, aux;

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			ArrayList<Integer> notas = new ArrayList<Integer>();
			ArrayList<Integer> posicoes = new ArrayList<Integer>();
			
			habitante = in.nextInt();
			consulta = in.nextInt();

			for (int i = 0; i < habitante; i++) {
				aux = in.nextInt();
				notas.add(aux);
			}

			for (int i = 0; i < consulta; i++) {
				aux = in.nextInt();
				posicoes.add(aux);
			}

			Collections.sort(notas, Collections.reverseOrder());

			for (int i = 0; i < posicoes.size(); i++) {
				System.out.println(notas.get(posicoes.get(i) - 1));
			}
		}
	}
}
