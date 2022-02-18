package Questoes.pergunta3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
		
	public static void main(String[] args) {
		String texto;
		int resultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");		
		texto = entrada.nextLine();
		
		resultado = anagrama(texto);
		
		System.out.println(resultado);
		
		entrada.close();
	}
	
	static int anagrama(String texto) {
		int resultado = 0;
		ArrayList<String> anagramas = new ArrayList<String>();
		
		for(int aux=0;aux<texto.length(); aux++) {
			for(int i = aux+1 ;i <=texto.length();i++) {
				String a = texto.substring(aux,i);
				anagramas.add(a);
			}
		}
		
		for(int i = 0 ; i<anagramas.size(); i++) {
			for(int j = 0 ; j<anagramas.size() ; j++ ) {
				if( j>i  && (isAnagrama(anagramas.get(i), anagramas.get(j)))){			
					resultado++;
				}
			}
		}	
	
		return resultado;
	}
	
	private static boolean isAnagrama(String s1,String s2) {
		boolean  resultado= false;
		
		if(s1.length() == s2.length()) {
			
			
			if(s1.length()>1) {
				
				char[]  texto1 = s1.toCharArray();
				Arrays.sort(texto1);
				s1 = new String(texto1);
				
				char[]  texto2 = s2.toCharArray();
				Arrays.sort(texto2);
				s2 = new String(texto2);
				
				if(s1.equals(s2))resultado = true;
				else resultado = false;
				
			}else {
				if(s1.equals(s2))resultado = true;
				else resultado = false;
			}
					
		}else {
			resultado  = false;
		}
		
		
		return resultado;
	}

}
