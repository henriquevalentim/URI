import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class URI1088 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0, aux;
		int cont = 0, k = 0;
		numero = in.nextInt();

		while (numero != 0) {

			int vet[] = new int[numero];
			int vet2[] = new int[100000];

			for (int l = 0; l < numero; l++) {
				vet[l] = in.nextInt();
			}

			for (int l = 0; l < numero; l++) {
				vet2[vet[l]]++;
			}

			for (int l = 0; l < 100000; l++) {
				if (vet2[l] != 0) {
					if (l != vet[k]) {
						for (int i = 0; i < numero; i++) {
							if (vet[numero] == l) {
								aux = vet[k];
								vet[k] = vet[numero];
								vet[numero] = aux;
								cont++;
								vet2[l]--;
								break;
								
							}
						}
					}
				}
			}

			/*
			 * for(int i = 0;i < numero;i++) { System.out.print(vet[i]+ " "); }
			 * System.out.println(); for(int i = 0;i < 10;i++) { System.out.print(vet2[i]+
			 * " "); }
			 */
			cont = 0;
		}
	}
}
