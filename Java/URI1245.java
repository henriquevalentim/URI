import java.io.IOException;
import java.util.Scanner;

public class URI1245 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int num, cont = 0, contadorPares = 0;
		String sapato;
		int esq[] = new int[61];
		int dir[] = new int[61];

		while (in.hasNext()) {
			cont = in.nextInt();

			for (int i = 0; i < cont; i++) {
				num = in.nextInt();
				sapato = in.next();

				if (sapato.equals("D")) {
					dir[num]++;
				} else if (sapato.equals("E")) {
					esq[num]++;
				}
			}
			for (int i = 30; i <= 60; i++) {
				if (dir[i] != 0 && esq[i] != 0) {
					if (dir[i] <= esq[i]) {
						contadorPares = contadorPares + dir[i];
					} else if (esq[i] < dir[i]) {
						contadorPares = contadorPares + esq[i];
					}
				}
			}
			System.out.println(contadorPares);
			contadorPares = 0;
			for (int i = 30; i < 61; i++) {
				dir[i] = 0;
				esq[i] = 0;
			}
		}
	}
}