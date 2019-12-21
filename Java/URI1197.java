import java.util.Scanner;

public class URI1197 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v,t;
		while(in.hasNext()) {
			v = in.nextInt();
			t = in.nextInt() * 2;
			
			System.out.println(v * t);
		}
	}
}
