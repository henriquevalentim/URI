
import java.io.IOException;
import java.util.Scanner;

public class URI1157 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int nDigitado = 0, n, aux = 1;

		nDigitado = ler.nextInt();

		n = nDigitado;
		
		while (aux <= nDigitado) {
			if ((n % aux) == 0) {
				System.out.println(aux);
				aux++;
			}else {
				aux++;
			}
		}
	}
}