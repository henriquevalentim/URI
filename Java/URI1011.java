
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1011 {

	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double pi = 3.14159, raio, total = 0;

		DecimalFormat df = new DecimalFormat("0.000");

		raio = ler.nextDouble();
		total = (4.0 / 3) * pi * (raio * raio * raio);

		System.out.println("VOLUME = " + df.format(total));
	}
}