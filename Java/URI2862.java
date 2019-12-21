import java.util.Scanner;

public class URI2862 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int casos,poder;
		casos = in.nextInt();
		for (int i = 0; i < casos; i++) {
			poder = in.nextInt();
			if(poder > 8000) {
				System.out.println("Mais de 8000!");
			}else {
				System.out.println("Inseto!");
			}
		}

	}
}
