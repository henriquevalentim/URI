
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double n = 3.14159, area, raio;

		DecimalFormat df = new DecimalFormat("0.0000");
		// df.applyPattern();

		raio = ler.nextDouble();
		area = n * (raio * raio);

		System.out.println("A=" + df.format(area));

	}

}