package br.com.calculo;

import java.util.Scanner;

public class CalculosAritmeticos {
	public static void main(String[] args) {

		// Instagram: @pikdev_
		// Youtube: @Pikachu Gamer
		// GitHub: @antonioCAGF
		// Linkedin: https://www.linkedin.com/in/antonio-guimar%C3%A3es-007ba61a8/

		// Exigindo valor via teclado para o usu�rio
		Scanner keyboard = new Scanner(System.in);

		// fun��o soma
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Soma iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a soma: ");
		System.out.println("----------------------------------------");
		double somaX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite um segundo valor para a soma: ");
		double somaY = keyboard.nextDouble();
		
		//c�lculo somar
		double somaTotal = somaX + somaY;
		System.out.println("----------------------------------------");
		System.out.println("A soma total foi igual a = " + somaTotal);
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Soma realizada com sucesso");

		// fun��o subtra��o
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Subtrair iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a subtra��o: ");
		double subtracaoX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite o segundo valor para a subtra��o: ");
		double subtracaoY = keyboard.nextDouble();
		
		//c�lculo subtra��o
		double subtracaoTotal = subtracaoX - subtracaoY;
		
		System.out.println("----------------------------------------");
		System.out.println("A subtra��o total foi igual a = " + subtracaoTotal);
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Subtra��o realizada com sucesso");
		System.out.println("----------------------------------------");

		// fun��o multiplica��o
		System.out.println("Fun��o Multiplicar iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a multiplica��o: ");
		double multiplicarX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite o segundo valor para a multiplica��o: ");
		double multiplicarY = keyboard.nextDouble();

		//c�lculo multiplica��o
		double multiplicarTotal = multiplicarX + multiplicarY;
		System.out.println("----------------------------------------");
		System.out.println("A multiplica��o total foi igual a = " + multiplicarTotal);
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Multiplica��o realizada com sucesso");

		// fun��o divis�o
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Divis�o iniciando...");
		System.out.println("----------------------------------------");

		System.out.println("Digite o primeiro valor para a divis�o: ");
		double divX = keyboard.nextDouble();
		System.out.println("Digite o segundo valor para a divis�o: ");
		double divY = keyboard.nextDouble();
		System.out.println("----------------------------------------");

		//c�lculo divis�o
		double divTotal = divX / divY;
		System.out.println("A divis�o total foi igual a = " + divTotal);
		System.out.println("----------------------------------------");
		System.out.println("Fun��o Divis�o realizada com sucesso");
		System.out.println("----------------------------------------");
	}
}
