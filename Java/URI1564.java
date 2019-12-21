import java.io.IOException;
import java.util.Scanner;

public class URI1564 {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int copa;
		while(in.hasNext()) {
			copa = in.nextInt();
			if(copa == 0) {
				System.out.println("vai ter copa!");
			}else {
				System.out.println("vai ter duas!");
			}
		}
	}

}
