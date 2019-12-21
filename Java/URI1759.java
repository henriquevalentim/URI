import java.io.IOException;
import java.util.Scanner;

public class URI1759 {

	public static void main(String[] args) throws IOException{

		Scanner in = new Scanner(System.in);
		int qtde = 0;
		qtde = in.nextInt();
		
		if(qtde == 1) {
			System.out.println("Ho!");
		}else if(qtde == 0){
		
		}else {
			System.out.print("Ho");
			for(int i = 1;i < qtde;i++) {
				System.out.print(" Ho");
			}
			System.out.println("!");
		}
	}

}
