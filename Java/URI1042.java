import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		int aux;

		for (int i = 0; i < 3; i++) {
			aux = ler.nextInt();
			lista.add(aux);
			lista2.add(aux);
		}

		lista.sort(null);

		for (int i = 0; i < 3; i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println(lista2.get(i));
		}
	}
}