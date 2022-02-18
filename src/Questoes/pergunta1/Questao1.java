package Questoes.pergunta1;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor:");
		int valor = entrada.nextInt();
		
		impressaoDasEscadas(valor);
		
		entrada.close();
	}
	
	
	static void impressaoDasEscadas(int valor) {
		String texto="";
		for(int i = valor ; i >=0 ; i--) {
			for(int j = 1 ; j<= valor; j++) {
				texto = j>i ? texto + "*" : texto +" "; 
			}
			
			System.out.println(texto);
			texto = "";
		}
	}
	
}
