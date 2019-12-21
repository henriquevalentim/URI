import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, distancia;

		DecimalFormat df = new DecimalFormat("0.0000");

		x1 = ler.nextDouble();
		y1 = ler.nextDouble();
		x2 = ler.nextDouble();
		y2 = ler.nextDouble();

		distancia = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

		System.out.println(df.format(distancia));

	}
}