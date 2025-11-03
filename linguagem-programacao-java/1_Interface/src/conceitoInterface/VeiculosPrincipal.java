package conceitoInterface;

public class VeiculosPrincipal {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.ligarMotor();
		carro1.acelerar();
		carro1.freiar();
		
		System.out.println("----------------------------------");
		
		Caminhao caminhao1 = new Caminhao();
		
		caminhao1.ligarMotor();
		caminhao1.acelerar();
		caminhao1.freiar();
	}
}
