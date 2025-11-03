/** 
 * Nesta seção de estudos, iremos conhecer os conceitos de construtores.
 * 
 *  O que são construtores? 
 *  
 *  São estruturas dentro de uma classe, semelhantes à um método, que irá receber dados via parâmetro, 
 *  e irá armazenar estes dados. Posteriormente, quando a classe for instaciada e for criado um novo objeto,
 *  o construtor irá ser requisitado, irá repassar para a classe a qual foi instaciada, os dados recebidos,
 *  e, posteriormente, estes dados poderão ser utilizados em um método para que seja realizada uma operação espcífica.
 *  
 *  Vejamos abaixo um exemplo do uso dos construtores.
 * */

package construtores;

public class Pessoa {
	String nome, nacionalidade, naturalidade;
	int idade;
	
	// Construtor da classe Pessoa
	void armazenarDados(String nome, String nacionalidade, String naturalidade, int idade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.idade = idade;
	}
	
	// Método que irá retornar os dados da pessoa
	String informarDados() {
		return "O nome da pessoa é " + this.nome + ", sua nacionalidade é " + this.nacionalidade + ", sua naturalidade é " + this.naturalidade + ", e sua idade é de " + this.idade + " anos de idade!";
	}
}
