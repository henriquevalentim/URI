import java.util.Scanner;

public class URI1743 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] plugue = new int[5];
		int[] tomada = new int[5];
		int contador = 0;
		
		for(int i = 0;i < 5;i++) {
			plugue[i] = in.nextInt();
		}
		
		for(int i = 0;i < 5;i++) {
			tomada[i] = in.nextInt();
		}
		
		for(int i = 0;i < 5;i++) {
			if(tomada[i] != plugue[i]) {
				contador++;
			}
		}
		
		if(contador == 5) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
	}

}
