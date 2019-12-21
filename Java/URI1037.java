import java.io.IOException;
import java.util.Scanner;

public class URI1037 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double valor;

		valor = ler.nextDouble();

		if (valor >= 0 && valor <= 25.0000) {
			System.out.println("Intervalo [0,25]");
		} else if (valor > 25.00001 && valor <= 50.0000000) {
			System.out.println("Intervalo (25,50]");
		} else if (valor > 50.00001 && valor <= 75.0000000) {
			System.out.println("Intervalo (50,75]");
		} else if (valor > 75.00001 && valor <= 100.0000000) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

	}
}