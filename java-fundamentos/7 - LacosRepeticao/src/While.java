
public class While {
	public static void main(String[] args) {
		// Nesta seção de estudos, iremos conhecer sobre o laço de repetição While.
		
		/** 
		 * O que são laços de repetição?
		 * 
		 * Laços de repetição são estruturas da linguagem de programação que são utilizadas quando precisamos realizar operações repetidas vezes.
		 * 
		 * Por exemplo, quando precisamos realizar alguma operação de forma repetitiva, ao invés de realizarmos manualmente,
		 * podemos utilizar os laços de repetição, que irão efetuar as operações de forma automática.
		 * 
		 * Para isto, podemos utilizar dois laços de repetição, que por sua vez, possuem algumas variações: WHILE e FOR.
		 * 
		 * Veremos neste documento sobre o laço While.
		 * 
		 * ### WHILE ###
		 * 
		 * Como funciona o laço while? 
		 * 
		 * While, do inglês Enquanto, é utilizado quando precisamos que uma, ou mais ações, sejam realizadas enquanto uma condição não seja satisfeita.
		 * 
		 * Além da forma tradicional do while, que veremos em um exemplo logo abaixo, temos o DO/WHILE. O que isto quer dizer?
		 * 
		 * Isto que dizer que antes de definirmos qual a condicional para a execução do laço, definimos qual, ou quais ações serão executadas.
		 * 
		 * Vejamos abaixo exemplos.
		 * 
		 * OBS: É necessário adicionar no scopo do código no while, um mecanismo para que o código não execute indefinidamente,
		 * pois isto pode acarretar problemas na execução da aplicação e consumo desnecessário de memória. No exemplo abaixo,
		 * definimos que enquanto a condição não seja satisfeita, o valor irá ser decrementado, ou seja, numero--. Desta forma,
		 * informamos que ao alcançar a condição necessária, a execução poderá ser interrompida.
		 * */
		
		// ### WHILE PADRÃO ###
		int numero = 10;
		
		while(numero > 0) {
			System.out.println("Número: " + numero);
			numero--;
		}
		
		System.out.println("___________________________________________");
		
		// ### DO/WHILE ###
		int numero2 = 0;
		
		do {
			numero2++;
			System.out.println("Número 2: " + numero2);
		} while(numero2 < 10);

	}
}
