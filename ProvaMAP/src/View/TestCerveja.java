package View;

import Model.CervejaFactory;
import Model.CervejaInterface;

public class TestCerveja {

	public static void main(String[] args) {
		CervejaFactory factory = new CervejaFactory();
		CervejaInterface cerveja = (CervejaInterface) factory.createCerveja("Laranja", true, "21/03/2020", "21/03/2022", 29.0);
		System.out.println(cerveja);
		
		CervejaFactory factory1 = new CervejaFactory();
		CervejaInterface cerveja1 = (CervejaInterface) factory.createCerveja("Puro Malte", false, "31/07/2020", "28/01/2021", 29.0);
		System.out.println(cerveja1);
		
		
	}

}
