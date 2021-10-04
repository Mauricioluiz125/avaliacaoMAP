package Model;

public class Cerveja {
	public String codigo;
	public Boolean alcool;
	public String dataValidade;
	public String dataProducao;
	public float preco;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getDataProducao() {
		return dataProducao;
	}
	public void setDataProducao(String dataProducao) {
		this.dataProducao = dataProducao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public Boolean getAlcool() {
		return alcool;
	}
	public void setAlcool(Boolean alcool) {
		this.alcool = alcool;
	}
	public Cerveja(String codigo, Boolean alcool, String dataValidade, String dataProducao, float preco) {
		super();
		this.codigo = codigo;
		this.alcool = alcool;
		this.dataValidade = dataValidade;
		this.dataProducao = dataProducao;
		this.preco = preco;
	}
	
	

}
