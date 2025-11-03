package enumExemplo;

import enumExemplo.Cinema.AUTORIZACAO;

public class CinemaPrincipal {

	public static void main(String[] args) {
		Cinema pes1 = new Cinema();
		
		pes1.idade = 15;
		pes1.possuiCadastro = true;
		pes1.estaAcompanhado = false;
		
		if(pes1.idade >= 18 || pes1.possuiCadastro && pes1.estaAcompanhado) {
			System.out.println(pes1.autorizacaoCinema = AUTORIZACAO.AUTORIZADO);
		} else {
			System.out.println(pes1.autorizacaoCinema = AUTORIZACAO.NEGADO);
		}
	}
}
