import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String nome;
		double salario, totalVendas, total;

		DecimalFormat df = new DecimalFormat("0.00");
		nome = ler.next();
		salario = ler.nextDouble();
		totalVendas = ler.nextDouble();
		total = salario + (totalVendas * 0.15);

		System.out.println("TOTAL = R$ " + df.format(total));
	}
}