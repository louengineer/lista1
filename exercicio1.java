package exemplo;

import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		System.out.println("insira um valor para teste");
		int valor=s.nextInt();
		
			int resto=valor % 10;
			if (resto == 0) {
				System.out.println("é divisivel por 10");
			}
			
			resto=valor % 5;
			if (resto == 0) {
				System.out.println("é divisivel por 5");
			}
			
			resto=valor % 2;
			if (resto == 0) {
				System.out.println("é divisivel por 2");
			}
			
	}
}
