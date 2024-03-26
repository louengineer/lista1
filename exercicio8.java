package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio8 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat d=new DecimalFormat ("#,###,##0.00");
		
		System.out.println("Diga suas notas");
		double nota1=s.nextDouble();
		
		double nota2=s.nextDouble();
		
		double nota3=s.nextDouble();
		
		double nota4=s.nextDouble();
		
		double calculo=nota1+nota2+nota3+nota4;
		double media=calculo/4;
		if (media >=7) {
			System.out.println("Você foi aprovado com média:" + d.format(media));
		}
		
		else {
		System.out.println("Você está em exame. Digite a sua nota do exame");
		double nota_exame=s.nextDouble();
		double nova_media=media+nota_exame;
		double nova_media2=nova_media/2;
		if (nova_media2 >=5) {
			System.out.println("Você foi aprovado em exame com média:" + d.format(nova_media2));
	}
		else
			
			if(nova_media2 <5) {
				System.out.println("Você foi reprovado com média:" +d.format(nova_media2));
				}
			}
	}
}
