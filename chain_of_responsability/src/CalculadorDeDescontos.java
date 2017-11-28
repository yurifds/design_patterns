
public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto d3 = new SemDesconto();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais(d3);
		Desconto d1 = new DescontoPorCincoItens(d2);
		
		return d1.desconta(orcamento);
	}

}
