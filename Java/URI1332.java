import java.util.Scanner;

public class URI1332 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero,cont = 0;
		numero = in.nextInt();
		String palavra,one = "one";
		for(int i = 0;i < numero;i++) {
			palavra = in.next();
			
			if(palavra.length() == 5) {
				System.out.println(3);
			}else if(palavra.length() == 3) {
				for(int j = 0;j < palavra.length();j++) {
					if(palavra.charAt(j) == one.charAt(j)) {
						cont++;
					}
				}
				if(cont >= 2) {
					System.out.println(1);
				}else {
					System.out.println(2);
				}
			}
			cont=0;
		}
	}
}
