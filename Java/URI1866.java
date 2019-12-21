import java.io.IOException;
import java.util.Scanner;

public class URI1866 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int casosTeste,numero;
		casosTeste = in.nextInt();
		
		for(int i = 0;i < casosTeste;i++) {
			numero = in.nextInt();
			if(numero%2==0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}
		
	}
}