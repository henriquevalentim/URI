import java.util.Scanner;

public class URI2172 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero,exp;
		numero = in.nextInt();
		exp = in.nextInt();
		
		while(numero != 0 && exp != 0) {
			System.out.println(numero * exp);
			numero = in.nextInt();
			exp = in.nextInt();
		}
	}
}
