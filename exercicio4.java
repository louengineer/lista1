package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat d=new DecimalFormat ("#,###,##0.00");

		int calorias=0;

				
		System.out.println("Informe o prato");
		int prato=s.nextInt();
		
		if (prato == 1) {
			calorias=calorias + 180;
		}
		if (prato == 2) {
			calorias=calorias + 230;
		}
		if (prato == 3) {
			calorias=calorias + 250;
		}
		if (prato == 4) {
			calorias=calorias + 350;
		}
		
		System.out.println("Informe a sobremesa");
		int sobremesa=s.nextInt();
		
		if (sobremesa == 1) {
			calorias=calorias + 75;
		}
		if (sobremesa == 2) {
			calorias=calorias + 110;
		}
		if (sobremesa == 3) {
			calorias=calorias + 170;
		}
		if (sobremesa == 4) {
			calorias=calorias + 200;
		}
		
		System.out.println("Informe a bebida");
		int bebida=s.nextInt();
		
		if (bebida == 1) {
			calorias=calorias + 20;
		}
		if (bebida == 2) {
			calorias=calorias + 70;
		}
		if (bebida == 3) {
			calorias=calorias + 100;
		}
		if (bebida == 4) {
			calorias=calorias + 65;
			
		}
		
		System.out.println("o total de calorias é:" +d.format(calorias));
		
}
}
