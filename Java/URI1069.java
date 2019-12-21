import java.util.Scanner;

public class URI1069 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String palavra;
		int qtde = in.nextInt();

		for (int i = 0; i < qtde; i++) {
			palavra = in.next();

			for (int j = palavra.length() - 1; j >= 0; j--) {
				if (palavra.charAt(j) > 96) {
					System.out.print(palavra.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
