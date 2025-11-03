
public class TiposDados {
	public static void main(String[] args) {
		// Nesta seção de estudos iremos conhecer sobre os principais tipos de dados no Java.
		
		/** Existem seis tipos principais de dados no Java: int, float, double, char, String, Boolean. Iremos conhecer abaixo um pouco sobre cada um deles.
		 * 
		 *  ### Int ###
		 *  
		 *  O tipo de dado int é utilizado quando precisamos definir que o valor de uma determinada variável irá ser um número inteiro, ou seja,
		 *  que não possui casa decimal. Iremos logo abaixo ver um exemplo do uso do int.
		 *  
		 *  
		 *  ### Float ###
		 *  
		 *  O tipo float é também utilizado quando desejamos declarar uma variável com valor numérico, porém, neste caso,
		 *  iremos definir que o número irá possuir casa decimal. Tal qual o int, iremos ver um exemplo logo abaixo.
		 *  
		 *  Uma observação que deve ser feita com relação ao float, é que ao final do valor da variável, deve-se adicionar a letra f.
		 *  Isto ocorre para que seja identificado que o valor da variável é do tipo float, pois se isto não for definido, irá ocorrer um erro, 
		 *  pois o Java irá interpretar que a variável é do tipo double e foi declarada como sendo float. E assim, irá informar que não é possível
		 *  efetuar a conversão de double para float.
		 *  
		 *  
		 *  ### Double ###
		 *  
		 *  O tipo de dado double também é utilizado para definirmos um valor numérico com casa decimal para uma variável,
		 *  mas as diferença para o float, é que no double, conseguimos atribuir para a variável uma quantidade maior de possibilidades numéricas.
		 *  
		 *  
		 *  ### Char ###
		 *  
		 *  O tipo de dado char é utilizado quando precisamos definir que uma variável irá receber como valor um dado textual. Neste caso,
		 *  somente poderemos definir um único caracter, por exemplo, uma única letra, e deverá estar entre aspas simples, ou apóstrofe.
		 *  
		 *  
		 *  ### String ###
		 *  
		 *  Tal qual o tipo de dado char, no tipo String podemos atribuir à variável um valor textual. Mas neste caso, diferente do char,
		 *  poderemos receber como valor uma quantidade maior de caracteres e poderemos utilizá-lo, por exemplo, quando queremos armazenar como valor,
		 *  o nome de uma pessoa ou uma frase específica.
		 *  
		 *  
		 *  ### BOOLEAN ###
		 *  
		 *  O tipo de dado boolean irá possui somente dois tipos de valores: verdadeiro (true) ou falso (false). Este tipo de dado,
		 *  é utilizado geralmente em verificações onde precisamos saber se uma informação é verdadeira ou falsa.
		 *  
		 *  Estes são os principais tipos de dados no Java. Existem outros, como long, byte, etc..., mas iremos nos ater ao citados acima.	
		 * */
		
		// Int
		int idade = 31;
		
		// Float
		float decimalCurto = 10.3f;
		
		// Double
		double decimalLongo = 3462.3;
		
		// Char
		char genero = 'M';
		
		// String
		String nome = "Lucas";
	}
}
