
public class Logicos {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer os conceitos sobre os chamados operadores lógicos.
		
		/** 
		 * O que são operadores lógicos?
		 * 
		 * Os operadores lógicos são estruturas que existem nas linguagens de programação 
		 * e que são utilizados para realizar verificações se algum dado é válido, verdadeiro, ou não.
		 * 
		 * Temos duas maneiras, ou operadores lógicos principais para realizar esta verificação: && ( E ) e também o || ( OU ).
		 * 
		 * O que é o operador && ? Utilizando dois & comerciais, nós podemos verificar seu uma informação é verdadeira,
		 * e se outra também é. Caso isto esteja correto, uma ação será executada. Caso contrário, não será executada.
		 * 
		 * Já o operador ||, chamado de operador OU, é utilizado para verificar se um dado é verdadeiro ou falso,
		 * OU se outro dado é verdadeiro ou falso. Caso um deles seja verdadeiro, uma ação é executada.
		 * 
		 * No caso do &&, as duas proposições, ou informações, devem ser verdadeiras. Caso a primeira já seja falsa,
		 * o código já irá encerrar a verificação e não verificará a segunda proposição.
		 * 
		 * Já no caso do || (OU), o código irá verificar se a primeira OU a segunda são válidas. Caso a primeira seja falsa,
		 * mesmo assim o código irá verificar se a segunda proposição é verdadeira ou falsa. A depender do resultado, uma ação será executada.
		 * 
		 * Vejamos abaixo um exemplo.
		 * */
		
		int idade = 19;
		boolean possuiCadastro = true;
		
		if(idade >= 18 && possuiCadastro == true) {
			System.out.println("Você poderá entrar e terá acesso ao clube privativo!");
		} else {
			System.out.println("Infelizmente você não poderá entrar!");
		}
		
		
		if(idade >= 18 || possuiCadastro == true) {
			System.out.println("Você poderá entrar, mas caso não possua cadastro, não poderá acessar o clube privativo!");
		} else {
			System.out.println("Infelizmente você não poderá entrar!");
		}
	}
}
