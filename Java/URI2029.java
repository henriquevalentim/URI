import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI2029 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		double volume, diametro, area, altura;
		DecimalFormat df = new DecimalFormat("0.00");

		while (in.hasNext()) {
			volume = in.nextDouble();
			diametro = in.nextDouble();

			area = (diametro / 2);
			area = (area * area) * 3.14;
			altura = volume / area;

			System.out.println("ALTURA = " + df.format(altura));
			System.out.println("AREA = " + df.format(area));
		}
	}
}