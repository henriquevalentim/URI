import java.util.Scanner;

public class URI1983 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtde = in.nextInt();
		double maior,numero;
		String identificacao, id2;

		identificacao = in.next();
		maior = in.nextDouble();

		for (int i = 0; i < qtde-1; i++) {
			id2 = in.next();
			numero = in.nextDouble();
			
			if (maior < numero) {
				maior = numero;
				identificacao = id2;
			}
		}
		if (maior >= 8) {
			System.out.println(identificacao);
		} else {
			System.out.println("Minimum note not reached");
		}

	}
}
