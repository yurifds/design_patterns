
public class ItemDaNota {
	private double valor;
	private String descricao;
	
	public ItemDaNota(String descricao, double valor) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
