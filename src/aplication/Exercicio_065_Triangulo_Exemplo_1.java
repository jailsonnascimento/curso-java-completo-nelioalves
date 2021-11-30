package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle_Exemplo_1;

public class Exercicio_065_Triangulo_Exemplo_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle_Exemplo_1 x, y;
		x = new Triangle_Exemplo_1();
		y = new Triangle_Exemplo_1();
		
		System.out.println("Enter tehe measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter tehe measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;		
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triangle X area: %.4fn ", areaX);
		System.out.printf("Triangle X area: %.4fn ", areaY);		
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
		sc.close();

	}

}

