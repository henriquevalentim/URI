import java.util.Scanner;

public class URI2414 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0,maior = 0;
		numero = in.nextInt();
		while(numero != 0) {
			if(numero > maior) {
				maior = numero;
			}
			numero = in.nextInt();
		}
		System.out.println(maior);
	}
}
