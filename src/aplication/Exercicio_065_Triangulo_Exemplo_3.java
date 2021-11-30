package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle_Exemplo_2;

// Programa com exemplo da area do trigangulo sendo calculada dentro da classe

public class Exercicio_065_Triangulo_Exemplo_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle_Exemplo_2 x, y;
		x = new Triangle_Exemplo_2();
		y = new Triangle_Exemplo_2();
		
		System.out.println("Enter tehe measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter tehe measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4fn: ", x.area());
		System.out.printf("Triangle X area: %.4fn: ", y.area());		
		
		if (x.area() > y.area()) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
		sc.close();

	}

}

