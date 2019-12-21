
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int total, notas[] = {0,0,0,0,0,0,0};
		
		total = ler.nextInt();
		System.out.println(total);
		
		notas[0] = total / 100;
		total = total % 100;
		notas[1] = total / 50;
		total = total % 50;
		notas[2] = total / 20;
		total = total % 20;
		notas[3] = total / 10;
		total = total % 10;
		notas[4] = total / 5;
		total = total % 5;
		notas[5] = total / 2;
		total = total % 2;
		notas[6] = total / 1;
		
		System.out.println(notas[0] + " nota(s) de R$ 100,00");
		System.out.println(notas[1] + " nota(s) de R$ 50,00");
		System.out.println(notas[2] + " nota(s) de R$ 20,00");
		System.out.println(notas[3] + " nota(s) de R$ 10,00");
		System.out.println(notas[4] + " nota(s) de R$ 5,00");
		System.out.println(notas[5] + " nota(s) de R$ 2,00");
		System.out.println(notas[6] + " nota(s) de R$ 1,00");

	}
}