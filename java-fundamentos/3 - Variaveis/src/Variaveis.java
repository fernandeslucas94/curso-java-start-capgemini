
public class Variaveis {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer os conceitos de variáveis.
		
		/** O que são variáveis?
		 * 
		 * Variáveis são estruturas da linguagem de programação que utilizamos quando desejamos armazenar algum dado específico.
		 *
		 * Estas variáveis, após criadas, declaradas, irão definir que os valores nelas armazenados, serão alocados, ou seja, 
		 * armazenados em um espaço da memória do dispositivo. Por conta disto, devemos ter cautela ao declararmos as variáveis e definirmos seus valores,
		 * pois ao declararmos variáveis de forma indiscriminada, a aplicação poderá utilizar espaços na memória além do necessário e desta maneira,
		 * poderá estar prejudicando o desempenho do dispositivo e consequentemente da aplicação que estiver em operação.
		 * 
		 * Como o Java é uma linguagem fortemente tipada, devemos, antes do nome da variável, definir qual será o tipo do dado armazenado nela,
		 * e após isto, podemos informar o nome da variável, adicionar o sinal de atribuição, =, e após ele podemos informar o valor que será armazenado.
		 * 
		 * No Java temos uma particularidade que não podemos esquecer. 
		 * Em alguns momentos, desejamos que o valor de uma variável não seja alterado após a declaração e definição do valor. Para isto, 
		 * utilizamos a palavra final, que irá informar e definir que o valor daquela variável não poderá ser alterado dali em diante.
		 * 
		 * Vejamos abaixo alguns exemplos.
		 * 
		 * */
		
		String nome = "Lucas";
		// String (tipo do dado), nome (o nome da variável), = (sinal de atribuição de valor), "Lucas" (valor armazenado na variável).
		
		final int numeroAleatorio = 350;
	}
}
