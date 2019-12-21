import java.util.Scanner;

public class URI2714 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String palavra;
		
		int qtdeCasos = in.nextInt();

		for (int i = 0; i < qtdeCasos; i++) {
			palavra = in.next();
			
			if(palavra.length() < 20 || palavra.length() > 20) {
				System.out.println("INVALID DATA");
			}else if(palavra.charAt(0) != 'R' && palavra.charAt(1) != 'A') {
				System.out.println("INVALID DATA");
			}else {
				for(int j = 2;j < palavra.length();j++) {
					if(palavra.charAt(j) > '0') {
						System.out.print(palavra.substring(j, palavra.length()));
						break;
					}
				}
				System.out.println();
			}
			
		}
		

	}
}
