import java.io.IOException;
import java.util.Scanner;

public class URI2763 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String cpf;
		
		cpf = in.next();
		System.out.println(cpf.substring(0, 3));
		System.out.println(cpf.substring(4, 7));
		System.out.println(cpf.substring(8, 11));
		System.out.println(cpf.substring(12, 14));
		
	}
}