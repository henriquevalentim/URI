import java.util.Scanner;

public class URI2791 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		for(int i = 1;i < 5;i++) {
			numero = in.nextInt();
			if(numero == 1) {
				System.out.println(i);
			}
		}
	}
}
