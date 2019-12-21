
import java.io.IOException;
import java.util.Scanner;

public class URI1013 {

	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3,maior;

		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		maior = (n1 + n2 + Math.abs(n1 - n2))/2;
		maior = (maior + n3 + Math.abs(maior - n3))/2;
		
		System.out.println(maior + " eh o maior");

	}
}