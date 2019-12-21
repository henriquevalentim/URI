import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI2453 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String palavra = in.readLine();
		
		palavra = palavra.replace("pppp", "+");
		
		palavra = palavra.replace("ppp", "*");
		
		palavra = palavra.replace("p", "");
		
		palavra = palavra.replace("*", "p");
		palavra = palavra.replace("+", "pp");
		System.out.println(palavra);
	}
}