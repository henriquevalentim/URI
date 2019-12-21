import java.util.Scanner;

public class URI1943 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();

		if (numero == 1) {
			System.out.println("Top 1");
		}else if(numero <= 3) {
			System.out.println("Top 3");
		}else if(numero <= 5) {
			System.out.println("Top 5");
		}else if(numero <= 10) {
			System.out.println("Top 10");
		}else if(numero <= 25) {
			System.out.println("Top 25");
		}else if(numero <= 50) {
			System.out.println("Top 50");
		}else{
			System.out.println("Top 100");
		}
	}
}
