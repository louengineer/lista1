package exemplo;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("coloque seu peso em kg");
		double peso=s.nextDouble();
		
		System.out.println("coloque sua altura em metro");
		double altura=s.nextDouble();
		
		double imc=peso/Math.pow(altura,2);
		
		if (imc <18.5) {
			System.out.println ("magreza");
		}
		
		if (imc >=18.5 && imc <24.9) {
			System.out.println ("normal");
		}
		
		if (imc >=25 && imc <29.9) {
			System.out.println ("sobrepeso");
		}
		
		
		if (imc >=30 && imc <34.9) {
			System.out.println ("obesidade grau I");
		}
		
		if (imc >=35 && imc <39.9) {
			System.out.println ("obesidade grau II");
		}
		
		if (imc >40) {
			System.out.println ("obesidade grau III");
		}
	}
}