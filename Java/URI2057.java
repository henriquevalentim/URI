import java.util.Scanner;

public class URI2057 {
	public static void main(String[] args) {
		int s,t,f;
		Scanner in = new Scanner(System.in);
		s = in.nextInt();
		t = in.nextInt();
		f = in.nextInt();
				
		if((s + t + f) < 24 && ((s + t + f) >= 0)) {
			System.out.println(s + t + f);
		}else if((s + t + f) > 24){
			System.out.println((s + t + f) - 24);
		}else if((s + t + f) == 24){
			System.out.println(0);
		}else if((s + t + f) < 0) {
			System.out.println((s + t + f) + 24);
		}
	}
}
