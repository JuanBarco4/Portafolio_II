package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticFunctions {
	
	public static void sumar() {
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num_1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num_2: ");
	double num2 = numeral2.nextDouble();
	
	double resultado = num1 + num2;
	
	System.out.println("El resultado es: " + resultado);

	}
	
	public static void restar() {
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num_1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num_2: ");
	double num2 = numeral2.nextDouble();
	
	double resultado = num1 - num2;
	
	System.out.println("El resultado es: " +resultado);

	}
	
	public static void dividir() {
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num_1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num_2: ");
	double num2 = numeral2.nextDouble();
	
	double resultado = num1 / num2;
	
	System.out.println("El resultado es: " +resultado);

	}
	
	public static void multiplicar() {
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num_1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num_2: ");
	double num2 = numeral2.nextDouble();
	
	double resultado = num1 * num2;
	
	System.out.println("El resultado es: " +resultado);

	}
	
	public static void residuo() {
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num_1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num_2: ");
	double num2 = numeral2.nextDouble();
	
	double resultado = num1 % num2;
	
	System.out.println("El resultado es: " +resultado);

	}
}
