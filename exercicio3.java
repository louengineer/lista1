package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat d= new DecimalFormat ("R$#,###,##0.00");
		
		System.out.println("Informe o saldo médio do cliente");
		double saldo=s.nextDouble();
		
		if (saldo >=0 && saldo <=500) {
			double credito=saldo;
			System.out.println ("nenhum crédito");	
		}
		
		else
		
		if (saldo >=501 && saldo <=1000) {
			double credito=saldo * 0.3;
			System.out.println ("seu valor de emprestimo é:" + d.format(credito));
		
		}	
		
		else
		
		if (saldo >=1001 && saldo <=3000) {
			double credito=saldo * 0.4;
			System.out.println ("seu valor de emprestimo é:" + d.format(credito));
			
		}	
		
		else
			
		if (saldo >3001) {
			double credito=saldo * 0.5;
			System.out.println ("seu valor de emprestimo é:" + d.format(credito));
			
		}	
	}

}
