package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat d= new DecimalFormat ("R$#,###,##0.00");
		
		System.out.println("Qual a sua idade?");
		
		double idade=s.nextDouble();
		
		if (idade <16) {
			System.out.println("Você não é um eleitor");	
		}
			
			else
				
			    if (idade >=18 && idade <=65) {
				System.out.println("Você é um eleitor");
		}
		
			    else
			    	
		        if (idade >=16 && idade <=17 ||idade >65) {
				System.out.println("Você é um eleitor facultativo");
	  
		        }
		

	}

}
