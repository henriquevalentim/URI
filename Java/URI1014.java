
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int distancia;
		double litros, total;
		
		DecimalFormat df = new DecimalFormat("0.000");

		distancia = ler.nextInt();
		litros = ler.nextDouble();

		total = distancia / litros;

		System.out.println(df.format(total) + " km/l");

	}
}