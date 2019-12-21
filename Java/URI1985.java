import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class URI1985 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int qtdeProdutos,numero,qtde;
		double total = 0;
		HashMap<Integer, Double> comida = new HashMap<>();
		comida.put(1001, 1.50);
		comida.put(1002, 2.50);
		comida.put(1003, 3.50);
		comida.put(1004, 4.50);
		comida.put(1005, 5.50);
		
		qtdeProdutos = in.nextInt();
		for(int i = 0;i < qtdeProdutos;i++) {
			numero = in.nextInt();
			qtde = in.nextInt();
			total += comida.get(numero) * qtde; 
		}
		System.out.println(df.format(total));
		
	}
}
