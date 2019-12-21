
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int qtdHora, numero;
		double valorHora, total;
		
		DecimalFormat df = new DecimalFormat("0.00");

		numero = ler.nextInt();
		qtdHora = ler.nextInt();
		valorHora = ler.nextDouble();
		total = qtdHora * valorHora;

		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + df.format(total));
	}
}