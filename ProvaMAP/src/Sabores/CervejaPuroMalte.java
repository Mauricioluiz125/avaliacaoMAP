package Sabores;

import Model.Cerveja;
import Model.CervejaInterface;

public class CervejaPuroMalte extends Cerveja implements CervejaInterface{

	
	public CervejaPuroMalte(String codigo, Boolean alcool, String dataValidade, String dataProducao, float preco) {
		super(codigo, alcool, dataValidade, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return "Cerveja Puro Malte";
	}

}
