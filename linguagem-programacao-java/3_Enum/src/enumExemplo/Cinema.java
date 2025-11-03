package enumExemplo;

/** 
 * Nesta seção de estudos iremos conhecer os conceitos sobre Enum.
 * 
 * O que é Enum?
 * 
 * Enum, no Java, é uma maneira de determinarmos um ou mais valores pré-determinados que serão usados
 * em determinado momento da execução do código.
 * 
 * Como exemplo, podemos definir que o Enum irá ter como valores AUTORIZADO e NEGADO. Com isto,
 * ao ser criado o objeto em uma nova classe, ao ser realizada determinada vericação, 
 * poderemos definir que o resultado da verificação poderá ser AUTORIZADO ou NEGADO, dependendo da condição.
 * 
 * No ENUM, devemos definir primeiramente, como um atributo da classe, o nome do ENUM e o nome da variável que irá receber
 * o valor pré-definido. O nome do ENUM, é definido como se fosse o tipo da variável, e neste caso, com letra maiúscula.
 * 
 * Logo após, para criarmos o ENUM, precisamos utilizar a seguinte estrutura: 
 * 
 * public enum NOME_DO_ENUM {
 * 	VALOR1,
 * 	VALOR2
 * }
 * */

public class Cinema {
	int idade;
	boolean possuiCadastro, estaAcompanhado;
	AUTORIZACAO autorizacaoCinema;
	
	void armazenarInformacoes(int idade, boolean possuiCadastro, boolean estaAcompanhado) {
		this.idade = idade;
		this.possuiCadastro = possuiCadastro;
		this.estaAcompanhado = estaAcompanhado;
	}
	
	public enum AUTORIZACAO {
		AUTORIZADO,
		NEGADO;
	}
}
