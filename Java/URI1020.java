
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int total, ano, mes, dia;

		total = ler.nextInt();

		ano = total / 365;
		total = total % 365;
		mes = total / 30;
		total = total % 30;
		dia = total;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}
}