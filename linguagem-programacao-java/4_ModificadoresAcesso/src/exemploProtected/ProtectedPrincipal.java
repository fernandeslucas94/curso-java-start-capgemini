package exemploProtected;

public class ProtectedPrincipal {
	protected String nome;
	protected int idade;
	
	void armazenarDados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
