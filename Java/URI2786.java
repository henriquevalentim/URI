import java.io.IOException;
import java.util.Scanner;

public class URI2786 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int largura, comprimento, tipoA, tipoB;

		largura = in.nextInt();
		comprimento = in.nextInt();

		if (largura == 1 && comprimento == 1) {
			tipoA = 1;
			tipoB = 0;
		} else if (largura == 1) {
			tipoA = largura * comprimento;
			tipoB = (comprimento - 1) * 2;
		} else if (comprimento == 1) {
			tipoA = largura * comprimento;
			tipoB = (largura - 1) * 2;
		} else {
			tipoA = (largura * comprimento) + ((largura - 1) * (comprimento - 1));
			tipoB = ((comprimento - 1) * 2) + ((largura - 1) * 2);
		}
		
		System.out.println(tipoA);
		System.out.println(tipoB);

	}
}