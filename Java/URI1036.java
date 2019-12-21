import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1036 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double a, b, c, r1, r2, delta;

		DecimalFormat df = new DecimalFormat("0.00000");

		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();

		if (a != 0) {
			delta = Math.pow(b, 2) - (4 * a * c);
			if (delta >= 0) {
				delta = Math.sqrt(delta);
				r1 = (-(b) + delta) / (2 * a);
				r2 = (-(b) - delta) / (2 * a);

				System.out.println("R1 = " + df.format(r1));
				System.out.println("R2 = " + df.format(r2));
			} else {
				System.out.println("Impossivel calcular");
			}
		} else {
			System.out.println("Impossivel calcular");
		}

	}
}