
public class EstruturasCondicionais {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer os conceitos sobre as chamadas estruturas condicionais.
		
		/** 
		 * O que são estruturas condicionais?
		 * 
		 * Estruturas condicionais, como o próprio nome diz, são estruturas da linguagem de programação 
		 * que são utilizadas para realizar verificações acerca da validade de uma ou mais informações.
		 * 
		 * Existem duas estruturas condicionais: IF/ELSE e o Switch.
		 * 
		 * ### IF/ELSE ###
		 * 
		 * A estrutura IF/ELSE, é utilizada quando precisamos verificar se uma informação é verdadeira ou não. Caso seja, uma ação será executada.
		 * Caso contrário, outra ação, ou nenhuma ação irá ser executada.
		 * 
		 * 
		 * ### SWITCH ### 
		 * 
		 * No caso do Switch, não há como realizar uma verificação sobre a verdade ou falsidade de algo, utilizando valores booleanos.
		 * Para o Switch, verificamos se o valor de uma variável é verdadeiro ou se é de algum valor que esperamos. Caso seja verdade,
		 * uma ação irá ocorrer. Caso contrário, outra ação irá ocorrer. Se o valor da variável não satisfazer nenhuma das condições,
		 * poderemos ter um resultado padrão que será apresentado.
		 * 
		 * Veremos abaixo exemplos da utilização destas estruturas.
		 * */
		
		// *** IF/ELSE ***
		double n1 = 10, n2 = 10, n3 = 10, n4 = 10;
		double media = (n1+n2+n3+n4) / 4;
		
		if(media >= 7) {
			System.out.println("Você está aprovado(a)!");
			
			if(media == 10) {
				System.out.println("Parabéns! Você foi aprovado(a) com nota máxima!");
			}
		}
		
		if(media >= 5 && media < 7) {
			System.out.println("Você está de recuperação!");
		}
		
		if(media < 5) {
			System.out.println("Infelizmente você não foi aprovado(a)!");
		}
		
		
		// *** SWITCH ***
		char genero = 'M';
		
		switch(genero) {
			case 'M':
				System.out.println("Você poderá ter acesso â área masculina!");
			break;
			
			case 'F':
				System.out.println("Você poderá ter acesso à área feminina!");
			break;
			
			default:
				System.out.println("Informe seu gênero corretamente.");
		}
	}
}
