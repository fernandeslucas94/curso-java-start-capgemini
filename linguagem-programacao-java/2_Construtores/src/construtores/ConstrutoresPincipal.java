package construtores;

public class ConstrutoresPincipal {
	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa();
		
		pes1.nome = "Lucas";
		pes1.idade = 31;
		pes1.nacionalidade = "Brasileiro";
		pes1.naturalidade = "Minas Gerais";
		
		System.out.println(pes1.informarDados());
	}
}
