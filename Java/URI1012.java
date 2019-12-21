
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1012 {

	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double pi = 3.14159, n1, n2, n3,triangulo,circulo,trapezio,quadrado,retangulo;

		DecimalFormat df = new DecimalFormat("0.000");

		n1 = ler.nextDouble();
		n2 = ler.nextDouble();
		n3 = ler.nextDouble();
		
		triangulo = (n1 * n3)/2;
		circulo = pi * (n3 * n3);
		trapezio = ((n1 + n2) * n3)/2;
		quadrado = n2 * n2;
		retangulo = n1 * n2;
		
		System.out.println("TRIANGULO: " + df.format(triangulo));
		System.out.println("CIRCULO: " + df.format(circulo));
		System.out.println("TRAPEZIO: " + df.format(trapezio));
		System.out.println("QUADRADO: " + df.format(quadrado));
		System.out.println("RETANGULO: " + df.format(retangulo));
	}
}