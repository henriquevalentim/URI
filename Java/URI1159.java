import java.io.IOException;
import java.util.Scanner;

public class URI1159 {
	public static void main(String[] args) throws IOException {
		int numero = 0,total = 0,cont = 0;
		Scanner in = new Scanner(System.in);
		
		numero = in.nextInt();
		while(numero != 0) {
			while(cont != 5) {
				if(numero % 2 == 0) {
					total += numero;
					cont++;
					numero++;
				}
				numero++;
			}
			System.out.println(total);
			total = 0;
			cont = 0;
			numero = in.nextInt();
		}
	}
}
