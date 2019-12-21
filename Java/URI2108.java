import java.util.Scanner;

public class URI2108 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] palavras;
		String frase = in.nextLine();
		int maiorNumero = 0,cont = 0;
		String maior = "";

		while (!frase.equals("0")) {
			palavras = frase.split(" ");
			// System.out.println(palavras.length);
			for (int i = 0; i < palavras.length; i++) {
				
				if(cont == 0) {
					maiorNumero = palavras[i].length();
					maior = palavras[i]; 
				}else if(maiorNumero <= palavras[i].length()) {
					maiorNumero = palavras[i].length();
					maior = palavras[i]; 
				}
				
				if (i < palavras.length - 1) {
					System.out.print(palavras[i].length() + "-");
				}else {
					System.out.println(palavras[i].length());
				}
			}
			frase = in.nextLine();
			cont++;
		}
		System.out.println();
		System.out.println("The biggest word: "+maior);
	}
}
