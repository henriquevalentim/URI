import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1183 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		double[][] mat = new double[12][12];
		DecimalFormat df = new DecimalFormat("0.0");
		double total = 0;
		int coluna = 1;
		String operacao;
		operacao = ler.next();
		for (int l = 0; l < 12; l++) {
			for (int c = 0; c < 12; c++) {
				mat[l][c] = ler.nextDouble();
			}
		}

		if (operacao.equals("S")) {
			for (int l = 0; l < 12; l++) {
				for (int c = coluna; c < 12; c++) {
					total = total + mat[l][c];
				}
				coluna++;
			}
		} else if (operacao.equals("M")) {
			for (int l = 0; l < 12; l++) {
				for (int c = coluna; c < 12; c++) {
					total = total + mat[l][c];
				}
				coluna++;
			}
			total = total / 66;
		}

		System.out.println(df.format(total));

	}
}