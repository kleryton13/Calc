package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Calculadora;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		try {
		System.out.println("Digite o primeira numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("Digite 1 - Soma");
		System.out.println("Digite 2 - subtra��o");
		System.out.println("Digite 3 - multiplica��o");
		System.out.println("Digite 4 - divis�o");
		int resp = sc.nextInt();
		Calculadora calc = new Calculadora(num1, num2);
		switch(resp){
		
		case 1: 
			System.out.printf("Resultado: " + calc.soma());
		break;
		case 2:
			System.out.printf("Resultado: " + calc.subtracao());
		break;
		case 3: 
			System.out.printf("Resultado: " + calc.multiplicacao());
		break;
		case 4: 
			System.out.printf("Resultado: " + calc.divisao());
		break;
		default:
			System.out.println("Nenhuma op��o foi selecionada!!");
			
		}
		}
		catch(InputMismatchException e) {
			System.out.println("Vo�e n�o digitou um numero!!");
		}
		catch(ArithmeticException e) {
			System.out.println("O divisor tem que ser diferente de zero!!");
		}
		
		sc.close();
		}
}
		

	


