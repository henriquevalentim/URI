import java.io.IOException;
import java.util.Scanner;

public class URI2780 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int numero;
		numero = in.nextInt();
		
		if(numero <= 800) {
			System.out.println(1);
		}else if(numero <= 1400) {
			System.out.println(2);
		}else if (numero <= 2000) {
			System.out.println(3);
		}
		
	}
}