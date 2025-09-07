
public class Aritiméticos {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer sobre como podemos utilizar operadores aritiméticos no Java.
		
		/** 
		 * O que são operadores aritiméticos?
		 * 
		 * Operadores aritiméticos são maneiras que o Java disponibiliza para que possamos realizar cálculos, operações matemáticas no código.
		 * 
		 * Quais são os operadores aritiméticos? Soma, Subtração, Divisão, Multiplicação e Resto de divisão, ou Módulo.
		 * 
		 * Vejamos abaixo alguns exemplos e como podemos realizar operações matemáticas no Java.
		 * 
		 * OBS: O operador de módulo é utilizado quando precisamos saber se irá restar algum valor após a divisão de dois números ou se será zero.
		 * 
		 * */
		
		double resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao, restoDivisao;
		double numero1 = 10;
		double numero2 = 5.5;
		
		// ### SOMA ###
		resultadoSoma = numero1 + numero2;
		
		// ### SUBTRAÇÃO ###
		resultadoSubtracao = numero1 - numero2;
		
		// ### MULTIPLICAÇÃO ###
		resultadoMultiplicacao = numero1 * numero2;
		
		// ### DIVISÃO ###
		resultadoDivisao = numero1 / numero2;
		
		// ### RESTO DA DIVISÃO OU MÓDULO ###
		restoDivisao = numero1 % numero2;
		
		System.out.println("--------------------------------");
		
		/** 
		 * Também podemos utilizar outros operadores aritiméticos no Java. Falaremos agora sobre os operadores de incremento e decremento.
		 * 
		 * O que eles fazem?
		 * 
		 * O operador de incremento é utilizado, normalmente, em laços de repetição, quando precisamos que uma operação seja realizada diversas vezes.
		 * E para isto, devemos definir que o código seja realizado quantas vezes forem necessárias. E para isto utilizamos o operador de incremento ++.
		 * 
		 * 
		 * Outro operador aritimético, com o funcionamento semelhante ao de incremento, é o opoerador de decremento. Diferente do operador de incremento,
		 * que irá somar mais um a cada nova operação, o operador de decremento irá diminuir a cada vez que o código é executado. 
		 * 
		 * Em ambos os operadores, podemos definir que a operação seja feita de um em um, dois em dois, e assim por diante.
		 * 
		 * Vejamos exemplos abaixo.
		 * */
		
		System.out.println("### INCREMENTO ###");
		int num1 = 0;
		
		while(num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		
		System.out.println("***************************");
		
		
		System.out.println("### DECREMENTO ###");
		int num2 = 10;
		
		while(num2 >= 0) {
			System.out.println(num2);
			num2--;
		}
	}
}
