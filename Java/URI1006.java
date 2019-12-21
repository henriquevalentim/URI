
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double n, n2, n3, total;

		DecimalFormat df = new DecimalFormat("0.0");

		n = ler.nextDouble();
		n2 = ler.nextDouble();
		n3 = ler.nextDouble();
		total = ((n * 2.0) + (n2 * 3.0) + (n3 * 5.0)) / 10;

		System.out.println("MEDIA = " + df.format(total));
	}
}