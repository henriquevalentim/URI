import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1174 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double[] vetor = new double[100];
		DecimalFormat df = new DecimalFormat("0.0");
		
		for (int i = 0; i < 100; i++) {
			vetor[i] = ler.nextDouble();
		}

		for (int i = 0; i < 100; i++) {
			if(vetor[i]<=10) {
				System.out.println("A[" + i + "] = " + df.format(vetor[i]));
			}
			
		}

	}
}