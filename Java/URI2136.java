
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI2136 {
	public static void main(String[] args) throws IOException{
		
		ArrayList<String> yes = new ArrayList<String>();
		ArrayList<String> no = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in);
		int maior,posicao;
		
		String var;
		String yesOrNo;
		var = in.next();
		do {
			yesOrNo = in.next();
			
			if(yesOrNo.equals("YES") && !yes.contains(var)){
				yes.add(var);
			}else if(yesOrNo.equals("NO")){
				no.add(var);
			}
			var = in.next();
		}
		while(!var.equals("FIM"));
		
		maior = yes.get(0).length();
		posicao = 0;
		for(int i = 1;i < yes.size();i++){
			if(yes.get(i).length() > maior) {
				maior = yes.get(i).length();
				posicao = i;
			}
		}
		
		String amigoPreferido = yes.get(posicao); 
		
		Collections.sort(yes);
		Collections.sort(no);
			
		for (int i = 0;i < yes.size();i++) {
			System.out.println(yes.get(i));
		}
		
		for (int i = 0;i < no.size();i++) {
			System.out.println(no.get(i));
		}
		System.out.println();
		System.out.println("Amigo do Habay:");
		System.out.println(amigoPreferido);
		
	}
}
