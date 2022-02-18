package Questoes.pergunta2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		//variaveis necessarias
		int quantidadeDeCaracter;
		int quantidadeQueFalta=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite uma senhar:");
		String senhar = entrada.nextLine();
		
		//logica para saber quantos caracteres faltas 
		quantidadeDeCaracter = senhar.length();
		if(quantidadeDeCaracter <6) {
			quantidadeQueFalta = 6 - quantidadeDeCaracter;
		}
		
		System.out.println(quantidadeQueFalta);
		
		entrada.close();
	}
	
}
