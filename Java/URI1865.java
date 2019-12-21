import java.io.IOException;
import java.util.Scanner;

public class URI1865 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int qtde = 0,num;
		String nome;
		qtde = in.nextInt();
		
		for(int i = 0;i < qtde;i++) {
			nome = in.next();
			num = in.nextInt();
			if(nome.equals("Thor")) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}
}
