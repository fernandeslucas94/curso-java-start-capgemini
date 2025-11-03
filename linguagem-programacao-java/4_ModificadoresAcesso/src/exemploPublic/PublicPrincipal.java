package exemploPublic;

public class PublicPrincipal {
	public String nome;
	public int idade;
	
	void armazenarDados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	String informarDados() {
		return "O nome da pessoa é " + this.nome + ", e sua idade é de " + this.idade + " anos de idade!";
	}
}
