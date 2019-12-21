
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double n, n2, total;

		DecimalFormat df = new DecimalFormat("0.00000");

		n = ler.nextDouble();
		n2 = ler.nextDouble();
		total = ((n * 3.5) + (n2 * 7.5))/11;

		System.out.println("MEDIA = " + df.format(total));

	}

}