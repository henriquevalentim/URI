import java.util.Scanner;

public class URI1930 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0;
		for(int i = 0;i < 4;i++) {
			numero += in.nextInt();
		}
		System.out.println(numero - 3);
	}
}
