import java.util.Scanner;

public class URI1240 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		String numeroInteiro, numeroParte;

		for (int i = 0; i < numero; i++) {
			numeroInteiro = in.next();
			numeroParte = in.next();
			if (numeroInteiro.length() >= numeroParte.length()) {
				if (numeroInteiro.substring(numeroInteiro.length() - numeroParte.length(), numeroInteiro.length())
						.equals(numeroParte)) {
					System.out.println("encaixa");
				}else {
					System.out.println("nao encaixa");
				}
			} else {
				System.out.println("nao encaixa");
			}
		}
	}

}
