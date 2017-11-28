
public class DescontoPorCincoItens implements Desconto{
	private Desconto proximo;
	
	public DescontoPorCincoItens(Desconto proximo) {
		this.proximo = proximo;
	}

    public double desconta(Orcamento orcamento) {
      if(orcamento.getItems().size() > 5) return orcamento.getValor() * 0.1; 
      else return proximo.desconta(orcamento);   
    }
}
