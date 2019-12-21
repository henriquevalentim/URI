import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1058 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int n,x,y,total = 0;
		
		n = ler.nextInt();

		for(int i = 0;i < n;i++) {
			x = ler.nextInt();
			y = ler.nextInt();
			
			for(int j = 0;j < y;) {
				if(x%2!=0) {
					total = total + x;
					j++;
				}
				x++;
			}
			System.out.println(total);
			total = 0;

		}
		
		
	}
}