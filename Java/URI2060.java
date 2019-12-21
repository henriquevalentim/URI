import java.util.Scanner;

public class URI2060 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, qtdeCasos, numero;
		qtdeCasos = in.nextInt();

		for (int i = 0; i < qtdeCasos; i++) {
			numero = in.nextInt();
			if (numero % 2 == 0) {
				cont2++;
			}
			if (numero % 3 == 0) {
				cont3++;
			}
			if (numero % 4 == 0) {
				cont4++;
			}
			if (numero % 5 == 0) {
				cont5++;
			}
		}

		System.out.println(cont2 + " Multiplo(s) de 2");
		System.out.println(cont3 + " Multiplo(s) de 3");
		System.out.println(cont4 + " Multiplo(s) de 4");
		System.out.println(cont5 + " Multiplo(s) de 5");

	}
}
