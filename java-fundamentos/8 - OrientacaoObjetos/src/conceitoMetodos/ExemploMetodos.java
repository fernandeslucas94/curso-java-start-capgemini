package conceitoMetodos;

public class ExemploMetodos {
	public static void main(String[] args) {
		MetodosConceito pes1 = new MetodosConceito();
		
		pes1.nome = "João da Silva";
		pes1.idade = 50;
		
		System.out.println(pes1.informarDados(pes1.nome, pes1.idade));
	}
}
