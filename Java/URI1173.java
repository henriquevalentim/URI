import java.io.IOException;
import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int vetor[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		vetor[0] = ler.nextInt();
		
		for (int i = 1; i < 10; i++) {
			vetor[i] = vetor[i-1] * 2;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}

	}
}