package br.com.calculo;

import java.util.Scanner;

public class CalculosAritmeticos {
	public static void main(String[] args) {

		// Instagram: @pikdev_
		// Youtube: @Pikachu Gamer
		// GitHub: @antonioCAGF
		// Linkedin: https://www.linkedin.com/in/antonio-guimar%C3%A3es-007ba61a8/

		// Exigindo valor via teclado para o usuário
		Scanner keyboard = new Scanner(System.in);

		// função soma
		System.out.println("----------------------------------------");
		System.out.println("Função Soma iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a soma: ");
		System.out.println("----------------------------------------");
		double somaX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite um segundo valor para a soma: ");
		double somaY = keyboard.nextDouble();
		
		//cálculo somar
		double somaTotal = somaX + somaY;
		System.out.println("----------------------------------------");
		System.out.println("A soma total foi igual a = " + somaTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Soma realizada com sucesso");

		// função subtração
		System.out.println("----------------------------------------");
		System.out.println("Função Subtrair iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a subtração: ");
		double subtracaoX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite o segundo valor para a subtração: ");
		double subtracaoY = keyboard.nextDouble();
		
		//cálculo subtração
		double subtracaoTotal = subtracaoX - subtracaoY;
		
		System.out.println("----------------------------------------");
		System.out.println("A subtração total foi igual a = " + subtracaoTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Subtração realizada com sucesso");
		System.out.println("----------------------------------------");

		// função multiplicação
		System.out.println("Função Multiplicar iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a multiplicação: ");
		double multiplicarX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite o segundo valor para a multiplicação: ");
		double multiplicarY = keyboard.nextDouble();

		//cálculo multiplicação
		double multiplicarTotal = multiplicarX + multiplicarY;
		System.out.println("----------------------------------------");
		System.out.println("A multiplicação total foi igual a = " + multiplicarTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Multiplicação realizada com sucesso");

		// função divisão
		System.out.println("----------------------------------------");
		System.out.println("Função Divisão iniciando...");
		System.out.println("----------------------------------------");

		System.out.println("Digite o primeiro valor para a divisão: ");
		double divX = keyboard.nextDouble();
		System.out.println("Digite o segundo valor para a divisão: ");
		double divY = keyboard.nextDouble();
		System.out.println("----------------------------------------");

		//cálculo divisão
		double divTotal = divX / divY;
		System.out.println("A divisão total foi igual a = " + divTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Divisão realizada com sucesso");
		System.out.println("----------------------------------------");
	}
}
