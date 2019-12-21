import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int codigo, quantidade;
		double valor, total = 0;

		DecimalFormat df = new DecimalFormat("0.00");

		codigo = ler.nextInt();
		quantidade = ler.nextInt();
		valor = ler.nextDouble();
		total += (quantidade * valor);

		codigo = ler.nextInt();
		quantidade = ler.nextInt();
		valor = ler.nextDouble();
		total += (quantidade * valor);

		System.out.println("VALOR A PAGAR: R$ " + df.format(total));
	}
}