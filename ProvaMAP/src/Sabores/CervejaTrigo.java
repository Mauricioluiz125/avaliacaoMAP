package Sabores;

import Model.Cerveja;
import Model.CervejaInterface;

public class CervejaTrigo extends Cerveja implements CervejaInterface {

	
	public CervejaTrigo(String codigo, Boolean alcool, String dataValidade, String dataProducao, float preco) {
		super(codigo, alcool, dataValidade, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return "Cerveja de Trigo";
	}

}
