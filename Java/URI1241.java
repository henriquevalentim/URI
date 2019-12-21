import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1241 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int cont, t1 = 0, t2 = 0;
		String texto1, texto2, aux;

		cont = ler.nextInt();

		for (int i = 0; i < cont; i++) {
			texto1 = ler.next();
			texto2 = ler.next();
			if (texto2.length() > texto1.length()) {
				System.out.println("nao encaixa");
			} else {
				aux = texto1.substring(texto1.length() - texto2.length(), texto1.length());
				if (aux.contains(texto2)) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			}
		}
	}
}