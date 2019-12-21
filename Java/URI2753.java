import java.util.ArrayList;
import java.util.Scanner;

public class URI2753 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Character>letras = new ArrayList<>();
		letras.add('a');
		letras.add('b');
		letras.add('c');
		letras.add('d');
		letras.add('e');
		letras.add('f');
		letras.add('g');
		letras.add('h');
		letras.add('i');
		letras.add('j');
		letras.add('k');
		letras.add('l');
		letras.add('m');
		letras.add('n');
		letras.add('o');
		letras.add('p');
		letras.add('q');
		letras.add('r');
		letras.add('s');
		letras.add('t');
		letras.add('u');
		letras.add('v');
		letras.add('w');
		letras.add('x');
		letras.add('y');
		letras.add('z');
		
		for(int i = 97,j = 0;i <= 122;i++) {
			System.out.println(i + " e " + letras.get(j));
			j++;
		}
		
	}
}
