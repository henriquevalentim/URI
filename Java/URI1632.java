import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1632 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtde = in.nextInt(), total = 0;
		String palavra;

		for (int i = 0; i < qtde; i++) {
			palavra = in.next();
			palavra = palavra.toLowerCase();

			if (palavra.charAt(0) == 'a' || palavra.charAt(0) == 'e' || palavra.charAt(0) == 'i'
					|| palavra.charAt(0) == 'o' || palavra.charAt(0) == 's') {
				total = 3;
			} else {
				total = 2;
			}

			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(j) == 'a' || palavra.charAt(j) == 'e' || palavra.charAt(j) == 'i'
						|| palavra.charAt(j) == 'o' || palavra.charAt(j) == 's') {
					total *= 3;
				}else {
					total *= 2;
				}
			}
			
			System.out.println(total);
			total = 0;
		}

	}
}
