import java.util.Scanner;

public class URI2444 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int volumeInicial = in.nextInt(),qtde = in.nextInt(),numero = 0;
		
		for(int i = 0;i < qtde;i++) {
			numero = in.nextInt();
			
			if(volumeInicial + numero > 100){
				volumeInicial = 100;
			}else if(volumeInicial + numero < 0){
				volumeInicial = 0;
			}else {
				volumeInicial += numero;
			}
		}
		System.out.println(volumeInicial);
	}
}
