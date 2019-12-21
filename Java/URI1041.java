import java.io.IOException;
import java.util.Scanner;

public class URI1041 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double x = 0, y = 0;

		x = ler.nextDouble();
		y = ler.nextDouble();

		if ((x > 0) && (y > 0)) {
			System.out.println("Q1");
		}

		if ((x < 0) && (y > 0)) {
			System.out.println("Q2");
		}

		if ((x < 0) && (y < 0)) {
			System.out.println("Q3");
		}

		if ((x > 0) && (y < 0)) {
			System.out.println("Q4");
		}

		if ((x == 0) && (y != 0)) {
			System.out.println("Eixo Y");
		}

		if ((y == 0) && (x != 0)) {
			System.out.println("Eixo X");
		}

		if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		}
	}
}