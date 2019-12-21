import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1182 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double[][] mat = new double[12][12];
		DecimalFormat df = new DecimalFormat("0.0");
		double total = 0;
		int coluna;
		String operacao;
		coluna = ler.nextInt();
		operacao = ler.next();
		for (int l = 0; l < 12; l++) {
			for (int c = 0; c < 12; c++) {
				mat[l][c] = ler.nextDouble();
			}
		}

		if (operacao.equals("S")) {
			for (int l = 0; l < 12; l++) {
				total = total + mat[l][coluna];
			}
		} else if (operacao.equals("M")) {
			for (int l = 0; l < 12; l++) {
				total += mat[l][coluna];
			}
			total = total / 12;
		}

		System.out.println(df.format(total));

	}
}