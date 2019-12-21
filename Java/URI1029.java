import java.util.Scanner;

public class URI1029 {
	static int contador = -1;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtde = in.nextInt();

		for (int i = 0; i < qtde; i++) {
			int numero = in.nextInt();
			int fibonaci = fibo(numero);
			System.out.println("fib(" + numero + ") = " + contador + " calls = " + fibonaci);
			contador = -1;
		}
	}

	public static int fibo(int numero) {
		contador++;
		if (numero == 0) {
			return 0;
		} else if (numero < 2) {
			return 1;
		} else {
			return fibo(numero - 1) + fibo(numero - 2);
		}
	}
}
