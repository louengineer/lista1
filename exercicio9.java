package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat d= new DecimalFormat ("#,###,##0.00");
		
		System.out.println("Por favor, insira cinco numeros inteiros");
		int numero1=s.nextInt();
		int numero2=s.nextInt();
		int numero3=s.nextInt();
		int numero4=s.nextInt();
		int numero5=s.nextInt();
	

		int soma=numero1+numero2+numero3+numero4+numero5;
		int media=soma/5;	
		System.out.println("A média é: " + media);
		
		
		
		System.out.println("Numeros maiores que a media");
		
		if (numero1 > media) {
			System.out.println ("numero 1 é maior que a média" + d.format(numero1));
		}
		if (numero2 > media) {
			System.out.println ("numero 2 é maior que a média"+ d.format(numero2));
		}
		
		if (numero3 > media) {
			System.out.println ("numero 3 é maior que a média"+ d.format(numero3));
		}
		
		if (numero4 > media) {
			System.out.println ("numero 4 é maior que a média"+ d.format(numero4));
		}
		
		if (numero5 > media) {
			System.out.println ("numero 5 é maior que a média"+ d.format(numero5));
		}
		
		
            }
		
	}

