
import java.io.IOException;
import java.text.DecimalFormat;

public class URI1156 {

	public static void main(String[] args) throws IOException {

		double  total = 0,n = 1;

		DecimalFormat df = new DecimalFormat("0.00");	
		
		for(int i = 1; i <= 100;i++) {
			total = total + (n/i);	
		}

		System.out.println(df.format(total));

	}

}