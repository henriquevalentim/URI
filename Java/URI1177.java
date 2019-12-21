import java.io.IOException;
import java.util.Scanner;

public class URI1177 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int cont, aux = 0;

		cont = ler.nextInt();

		for (int i = 0; i < 1000; i++) {
			System.out.println("N[" + i + "] = " + aux);
			aux++;
			if(aux >= cont) {
				aux = 0;
			}
		}
	}
}