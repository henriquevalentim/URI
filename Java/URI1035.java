import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1035 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int codigo, quantidade;
		double valor, lanche[] = { 4, 4.5, 5, 2, 1.5 };

		DecimalFormat df = new DecimalFormat("0.00");
		codigo = ler.nextInt();
		quantidade = ler.nextInt();

		valor = lanche[codigo - 1] * quantidade;

		System.out.println("Total: R$ " + df.format(valor));
	}
}