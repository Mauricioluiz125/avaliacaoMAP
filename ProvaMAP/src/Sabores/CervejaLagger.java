package Sabores;

import Model.Cerveja;
import Model.CervejaInterface;

public class CervejaLagger extends Cerveja implements CervejaInterface {


	public CervejaLagger(String codigo, Boolean alcool, String dataValidade, String dataProducao, float preco) {
		super(codigo, alcool, dataValidade, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return "Cerveja Lagger";
	}

}
