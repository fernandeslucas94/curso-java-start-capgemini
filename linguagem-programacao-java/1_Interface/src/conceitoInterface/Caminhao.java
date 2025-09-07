package conceitoInterface;

public class Caminhao implements InterfaceVeiculo {
	public void ligarMotor() {
		System.out.println("O caminhão está com o motor ligado!");
	}
	
	public void acelerar() {
		System.out.println("O caminhão está acelerando!");
	}
	
	public void freiar() {
		System.out.println("O caminhão está freiando!");
	}
}
