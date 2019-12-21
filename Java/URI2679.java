import java.util.Scanner;

public class URI2679 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		if((numero % 2)==0) {
			System.out.println(numero+2);
		}else {
			System.out.println(numero+1);
		}
	}
}
