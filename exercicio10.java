package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat d= new DecimalFormat ("R$#,###,##0.00");
		
		System.out.println("Digite a quantidade em kg");
		double peso=s.nextDouble();
		double pesoMaximo=500;
		double excesso=peso-pesoMaximo;
		double multa=excesso*4;
		
		if (peso <=500) {
			System.out.println("Você não excedeu o limite e não deve multa.");
		}
		if (peso >500) {
			System.out.println("Você deve pagar uma multa de excesso:" + d.format (multa));
		}
		
		
	}
}