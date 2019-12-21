
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int distancia, tempo;
		double total;
		
		DecimalFormat df = new DecimalFormat("0.000");

		tempo = ler.nextInt();
		distancia = ler.nextInt();
		total = (distancia * tempo) / 12.0;

		System.out.println(df.format(total));

	}
}