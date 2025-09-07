
public class Relacionais {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer sobre os operados relacionais.
		
		/** 
		 * O que são operadores relacionais?
		 * 
		 * São operadores que são utilizados para veriricar, como o próprio nome diz, a relação que existe entre variáveis.
		 * Podemos verificar se um dado é igual a outro, se um número é maior ou menor, se algo é verdadeiro ou falso, etc...
		 * 
		 * Dentre os operadores relacionais possuimos: Maior Que ( > ), Menor que ( < ), Maior ou igual ( >= ), 
		 * Menor ou igual ( <= ), Diferente ( != ), Igual ( == ).
		 * 
		 * Vejamos abaixo alguns exemplos.
		 * */
		
		int num1 = 10;
		int num2 = 12;
		
		// ### IGUALDADE ###
		if(num1 == num2) {
			System.out.println("Os números são iguais!");
		} else {
			System.out.println("Os números não são iguais!");
		}
		
		// ### DIFERENÇA ###
		if(num1 != num2) {
			System.out.println("Número 1 é diferente de número 2!");
		} else {
			System.out.println("Os números são iguais!");
		}
		
		// ### MAIOR ###
		if(num1 > num2) {
			System.out.println("Número 1 é maior que número 2!");
		} else {
			System.out.println("Número 2 é maior que número 1!");
		}
		
		// ### MENOR ###
		if(num1 < num2) {
			System.out.println("Número 1 é menor que número 2!");
		} else {
			System.out.println("Número 2 é menor que número 1!");
		}
		
		// ### MAIOR OU IGUAL ###
		if(num1 >= num2) {
			System.out.println("Número 1 é maior ou igual à número 2!");
		} else {
			System.out.println("Número 2 é menor ou diferente que número 1!");
		}
		
		// ### MENOR OU IGUAL ###
		if(num1 <= num2) {
			System.out.println("Número 1 é menor ou igual à número 2!");
		} else {
			System.out.println("Número 2 é maior ou diferente que número 1!");
		}
	}
}
