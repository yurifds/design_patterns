
public class TestaCorrente {
	public static void main(String[] args) {
		
		Desconto d3 = new SemDesconto();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais(d3);
        Desconto d1 = new DescontoPorCincoItens(d2);
        Orcamento orcamento = new Orcamento(501.0);
        
        double valorDesconto = d1.desconta(orcamento);
        
        System.out.println("Valor do desconto: " + valorDesconto);
		
	}
}
