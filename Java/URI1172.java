import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1172 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int vetor[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < 10; i++) {
			vetor[i] = ler.nextInt();
			if (vetor[i] <= 0) {
				vetor[i] = 1;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("X[" + i + "] = " + vetor[i]);
		}

	}
}