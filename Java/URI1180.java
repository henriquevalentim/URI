import java.io.IOException;
import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int cont, menor, posicao;
		cont = ler.nextInt();
		int[] numeros = new int[cont];

		for (int l = 0; l < cont; l++) {
			numeros[l] = ler.nextInt();
		}
		
		menor = numeros[0];
		posicao = 0;
		
		for (int l = 1; l < cont; l++) {
			if (menor > numeros[l]) {
				menor = numeros[l];
				posicao = l;
			}
		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
	}
}