import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1178 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double valor;
		DecimalFormat df = new DecimalFormat("0.0000");

		valor = ler.nextDouble();

		for (int i = 0; i < 100; i++) {
			System.out.println("N[" + i + "] = " + df.format(valor));
			valor = valor / 2;
		}
	}
}