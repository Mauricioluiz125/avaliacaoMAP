package Model;

public interface CervejaInterface {
	/*
	 * Princípio da Segregação da Interface:
	 * Muitas interfaces específicas são melhores do que uma interface única.
	 * 
	 * No caso desta interface ela contém apenas uma função específica que é
	 * o getDescription que tem como função retornar a descrição da cerveja.
	 */
	public String getDescription();
}
