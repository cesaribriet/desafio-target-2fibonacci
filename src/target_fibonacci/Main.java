package target_fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();

		int numInicial = 0;
		int numAnterior = 1;
		int numAtual = 0;
		if (num == 0) {
			System.out.println("O numero pertence a sequencia de Fibonacci.");
		} else {
			while (numAtual < num) {
				numAtual = numAnterior + numInicial;
				numInicial = numAnterior;
				numAnterior = numAtual;
			}
			if (numAnterior > num) {
				System.out.println("O numero nao pertence a sequencia Fibonacci.");
			} else {
				System.out.println("O numero pertence a sequencia de Fibonacci.");
			}
		}
		sc.close();

	}

}
