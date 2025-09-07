
public class For {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer sobre o laço de repetição For.
		
		/** 
		 * O que é o laço de repetição For? 
		 * 
		 * Semelhante ao laço While, o For é utilizando também quando necessitamos de realizar operações repetitivas.
		 * 
		 * Mas diferente do While, podemos declarar uma variável que irá armazenar o valor da operação,
		 * adicionar a condicional e o sinal de incremento dentro do escopo do For, ao contrário do While onde devemos efetuar algumas destas operações,
		 * fora do escopo do laço.
		 * 
		 * O For é muito utilizado em situações que precisamos lidar com arrays, ou vetores. Porém, não somente para isto.
		 * 
		 * Veremos abaixo um exemplo da utilização do For.
		 * */
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("O número do momento é: " + i);
		}
		
		
		/** 
		 * Também podemos utilizar uma forma para verificar, por exemplo, se determinado valor está contido no array. Para isto,
		 * podemos adicionar a palavra break dentro de uma condicional, para caso seja verdadeiro, a execução irá parar e o valor será mostrado.
		 * 
		 * Vejamos abaixo um exemplo.
		 * */
		
		String nome[] = {"Lucas", "Marina", "Pedro", "Clara"};
		
		for(int i = 0; i <= nome.length; i++) {
			if(nome[i] == "Marina") {
				System.out.println("O nome está contido no array.");
				break;
			}
		}
	}
}
