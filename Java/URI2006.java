import java.util.Scanner;

public class URI2006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cha, numero,cont = 0;
		cha = in.nextInt();
		
		for(int i = 0;i < 5;i++) {
			numero = in.nextInt();
			if(cha == numero) {
				cont++;
			}
		}
		System.out.println(cont);
		
	}
}
