import exemploPublic.PublicPrincipal;
import exemploDefault.ExemploDefault;
import exemploProtected.ProtectedPrincipal;
import exemploPrivate.PrivatePrincipal;

/** 
 * Nesta seção de estudos iremos conhecer os conceitos sobre os modificadores de acesso.
 * 
 * O que são modificadores de acesso?
 * 
 * São mecanismos do Java que permitem definir se uma classe, atributo ou método estará acessível por outra classe e pacote.
 * 
 * Existem quatro modificadores de acesso: default, public, private e protected.
 * 
 * Os modificadores de acesso são divididos em dois níveis: Nível superior e Nível de membro.
 * 
 * No nível superior, os modificadores são aplicados às classes, e são dois: public e default.
 * 
 * Já o nível de membro, os modificaores são aplicados à atributos e métodos.
 * 
 * ### Public ###
 * O modificador de acesso public, é utilizado em declaração de classes, métodos e atributos.
 * 
 * Toda classe deve ser definida com o modificaor de acesso public. Além disso, ao declarar um método ou atributo com o modificador public,
 * definimos que eles estarão acessíveis em qualquer classe e em qualquer pacote.
 * 
 * Assim, como o próprio nome diz, as classes, métodos e atributos declarados como public, são vísiveis para qualquer outra classe em qualquer outro pacote,
 * não somente no pacote onde a classe foi criada.
 * 
 * 
 * 
 * ### Default ###
 * 
 * O modificador default, como o próprio nome diz, é um modificador de acesso padrão. Caso não seja definido um modificador,
 * por padrão, a classe, método ou atributo irá ser declarado por padrão como default. O que isto que dizer?
 * 
 * Quer dizer que o Java irá, por conta própria, atribuir um modificador de acesso com suas características.
 * 
 * O modificador default, define que os métodos e atributos estarão somente acessíveis em classes que estejam em um mesmo pacote.
 * Com ele, os métodos e atributos são passíveis de serem acessados e utilizados nas classes onde foram declarados,
 * e também em subclasses que derivem de uma classe principal, e que estejam em um mesmo pacote. 
 * 
 * Ele é um modificador de acesso mais restritivo.
 * 
 * 
 * ### Protected ### 
 * 
 * O modificador protected, é utilizado quando precisamos definir que um atributo ou método irá ser acessível somente
 * por classes que estejam em um mesmo pacote. Com isto, caso o atributo, ou método seja requisitado em uma classe que esteja em outro pacote,
 * ela não estará acessível. Desta maneira, há uma maior proteção e segurança para o atributo, ou método em questão.
 * 
 * 
 * ### Private ###
 * 
 * O modificador de acesso private, é utilizado quando definimos que um atributo ou método, irá somente ser acessível dentro da classe onde foi declarado.
 * Com isto, caso o método ou atributo seja requisitado em outra classe, mesmo que no mesmo pacote, ela não estará acessível.
 * 
 * E com isto, ocorre um nível maior de segurança e proteção para os métodos e atributos. Evitando assim, que uma operação irregular e indesejada ocorra.
 * 
 * */

public class ModificadoresPrincipal {
	
	public static void main(String[] args) {
		
		// *** Exemplo Public ***
		/** 
		 * Neste exemplo é feita importação da classe PublicPrincipal, do pacote exemploPublic,
		 * e como a classe, seus métodos e atributos foram declarados com o modificador public,
		 * são acessíveis e manipuláveis através de outras classes.
		 * */
		PublicPrincipal pessoa1 = new PublicPrincipal();
		
		pessoa1.nome = "Lucas";
		pessoa1.idade = 31;
		
		
		// *** Exemplo Default ***
		/** 
		 * No exemplo abaixo, após ser feita a importação da classe ExemploDefault, podemos instanciar a classe,
		 * e criar um novo objeto que irá conter os atributos e métodos da classe ExemploDefault.
		 * 
		 * Como, ao declarar os atributos, não foi definido um modificador de acesso, como o public, por exemplo,
		 * o próprio Java define que o modificador será o padrão, ou seja, default.
		 * 
		 * Como podemos ver no exemplo, ao invocarmos os atributos nome e idade, ocorreu um erro. E isto ocorreu,
		 * por conta de que o modificar de acesso default, não torna acessível os atributos e métodos que estejam em outros pacotes.
		 * */
		ExemploDefault pessoa2 = new ExemploDefault();
		
		pessoa2.nome = "Lucas";
		pessoa2.idade = 31;
		
		
		// *** Exemplo Protected ***
		/** 
		 * Vejamos abaixo um exemplo da utilização do modificador de acesso protected.
		 * */
		ProtectedPrincipal pessoa3 = new ProtectedPrincipal();
		
		pessoa3.nome = "Lucas";
		pessoa3.idade = 31;
		
		
		// *** Exemplo Private ***
		/** 
		 * Vejamos abaixo um exemplo do comportamento dos atrbutos e métodos no caso da utilização do modificador private.
		 * */
		
		PrivatePrincipal pessoa4 = new PrivatePrincipal();
		
		pessoa4.nome = "Lucas";
		pessoa4.idade = 31;
	}
}
