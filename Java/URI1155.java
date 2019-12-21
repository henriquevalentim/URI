
import java.io.IOException;
import java.text.DecimalFormat;

public class URI1155 {

	public static void main(String[] args) throws IOException {

		double  total = 1,n = 2;

		DecimalFormat df = new DecimalFormat("0.00");	
		
		for(int i = 3; i <= 39;i+=2) {
			total = total + (i/n);
			n = n * 2;
		}

		System.out.println(df.format(total));

	}

}