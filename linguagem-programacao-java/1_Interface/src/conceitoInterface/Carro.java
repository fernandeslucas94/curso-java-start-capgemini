package conceitoInterface;

public class Carro implements InterfaceVeiculo{
	public void ligarMotor() {
		System.out.println("O motor do carro está ligado!");
	}
	
	public void acelerar() {
		System.out.println("O carro está acelerando!");
	}
	
	public void freiar() {
		System.out.println("O carro está freiando!");
	}
}
