package Model;

import Sabores.CervejaCerejaAmendoas;
import Sabores.CervejaLagger;
import Sabores.CervejaLaranja;
import Sabores.CervejaPilsen;
import Sabores.CervejaPuroMalte;
import Sabores.CervejaTrigo;

public class CervejaFactory {

	public static Cerveja createCerveja(String codigo, Boolean alcool, String dataValidade, String dataProducao, double d) {
		if (codigo.equals("Cereja")) {
			return new CervejaCerejaAmendoas(codigo, alcool, dataValidade, dataProducao, 0);
		}else if(codigo.equals("Lagger")){
			return new CervejaLagger(codigo, alcool, dataValidade, dataProducao, 0);
		}else if(codigo.equals("Laranja")) {
			return new CervejaLaranja(codigo, alcool, dataValidade, dataProducao, 0);
		}else if(codigo.equals("Pilsen")) {
			return new CervejaPilsen(codigo, alcool, dataValidade, dataProducao, 0);
		}else if(codigo.equals("Puro Malte")) {
			return new CervejaPuroMalte(codigo, alcool, dataValidade, dataProducao, 0);
		}else if (codigo.equals("Trigo")) {
			return new CervejaTrigo(codigo, alcool, dataValidade, dataProducao, 0);
		}
		return null;
	}
	}
