import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double N1 = 0, N2 = 0, N3 = 0, N4 = 0, media = 0, exame = 0;

		DecimalFormat df = new DecimalFormat("0.0");

		N1 = ler.nextDouble();
		N2 = ler.nextDouble();
		N3 = ler.nextDouble();
		N4 = ler.nextDouble();

		media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		System.out.println("Media: " + df.format(media));
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		}

		if (media < 5) {
			System.out.println("Aluno reprovado.");
		}

		if ((media >= 5) && (media <= 6.9)) {
			System.out.println("Aluno em exame.");
			exame = ler.nextDouble();
			System.out.println("Nota do exame: " + df.format(exame));

			media = (media + exame) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + df.format(media));
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + df.format(media));
			}
		}
	}
}