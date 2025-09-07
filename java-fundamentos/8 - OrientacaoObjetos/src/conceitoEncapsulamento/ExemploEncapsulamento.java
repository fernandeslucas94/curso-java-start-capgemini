package conceitoEncapsulamento;

public class ExemploEncapsulamento {
	public static void main(String[] args) {
		Encapsulamento pes1 = new Encapsulamento();
		
		pes1.setIdade(50);
		pes1.setNome("Pedro");
		
		System.out.println(pes1.mostrarDados());
	}
}
