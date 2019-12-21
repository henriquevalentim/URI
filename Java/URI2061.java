import java.io.IOException;
import java.util.Scanner;

public class URI2061 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int qtdeAbas,movimentos;
		String palavra;
		qtdeAbas = in.nextInt();
		movimentos = in.nextInt();
		
		for(int i = 0; i < movimentos;i++) {
			palavra = in.next();
			if(palavra.equals("fechou")) {
				qtdeAbas++;
			}else if(palavra.equals("clicou")){
				qtdeAbas--;
			}
		}
		System.out.println(qtdeAbas);
		
	}
}