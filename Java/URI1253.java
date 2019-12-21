import java.util.Scanner;

public class URI1253 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char l = ' ';
		int numero, qtde, decimal;
		qtde = in.nextInt();
		for (int i = 0; i < qtde; i++) {
			String palavra = in.next();
			numero = in.nextInt();
			for (int j = 0; j < palavra.length(); j++) {
				if ((int) palavra.charAt(j) - numero >= 65 && (int) palavra.charAt(j) - numero <= 90) {
					decimal = ((int) palavra.charAt(j)) - numero;
					l = (char) decimal;
				} else if ((int) palavra.charAt(j) - numero < 65) {
					decimal = (int) palavra.charAt(j) - 65;
					decimal = 90 - (numero - decimal);
					l = (char) (decimal + 1);
				}
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
