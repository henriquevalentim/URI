import java.io.IOException;
import java.util.Scanner;

public class URI1175 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[20];
		int aux, num = 19;

		for (int i = 0; i < 20; i++) {
			vetor[i] = ler.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			aux = vetor[num];
			vetor[num] = vetor[i];
			vetor[i] = aux;
			num--;
		}

		for (int i = 0; i < 20; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}

	}
}