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

		VariaveisCalculo val = new VariaveisCalculo();

		// função soma
		System.out.println("----------------------------------------");
		System.out.println("Função Soma iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a soma: ");
		System.out.println("----------------------------------------");
		val.somaX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite um segundo valor para a soma: ");
		val.somaY = keyboard.nextDouble();

		// cálculo somar
		val.somaTotal = val.somaX + val.somaY;
		System.out.println("----------------------------------------");
		System.out.println("A soma total foi igual a = " + val.somaTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Soma realizada com sucesso");

		// função subtração
		System.out.println("----------------------------------------");
		System.out.println("Função Subtrair iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a subtração: ");
		val.subtracaoX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite o segundo valor para a subtração: ");
		val.subtracaoY = keyboard.nextDouble();

		// cálculo subtração
		val.subtracaoTotal = val.subtracaoX - val.subtracaoY;

		System.out.println("----------------------------------------");
		System.out.println("A subtração total foi igual a = " + val.subtracaoTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Subtração realizada com sucesso");
		System.out.println("----------------------------------------");

		// função multiplicação
		System.out.println("Função Multiplicar iniciando...");
		System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor para a multiplicação: ");
		val.multiplicarX = keyboard.nextDouble();
		System.out.println("----------------------------------------");
		System.out.println("Digite o segundo valor para a multiplicação: ");
		val.multiplicarY = keyboard.nextDouble();

		// cálculo multiplicação
		val.multiplicarTotal = val.multiplicarX + val.multiplicarY;
		System.out.println("----------------------------------------");
		System.out.println("A multiplicação total foi igual a = " + val.multiplicarTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Multiplicação realizada com sucesso");

		// função divisão
		System.out.println("----------------------------------------");
		System.out.println("Função Divisão iniciando...");
		System.out.println("----------------------------------------");

		System.out.println("Digite o primeiro valor para a divisão: ");
		val.divisaoX = keyboard.nextDouble();
		System.out.println("Digite o segundo valor para a divisão: ");
		val.divisaoY = keyboard.nextDouble();
		System.out.println("----------------------------------------");

		// cálculo divisão
		val.divisaoTotal = val.divisaoX / val.divisaoY;
		System.out.println("A divisão total foi igual a = " + val.divisaoTotal);
		System.out.println("----------------------------------------");
		System.out.println("Função Divisão realizada com sucesso");
		System.out.println("----------------------------------------");
	}
}
