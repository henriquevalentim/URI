
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int total, hora, minuto, segundo;

		total = ler.nextInt();

		minuto = total / 60;
		total = total % 60;
		hora = minuto / 60;
		minuto = minuto % 60;
		segundo = total;

		System.out.println(hora + ":" + minuto + ":" + segundo);


	}
}