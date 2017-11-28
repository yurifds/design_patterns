
public class ICPP extends TemplateDeImpostoCondicional{

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		boolean isMaiorQue100 = false;
		for (Item item : orcamento.getItems()) {
			if(item.getValor() > 100) isMaiorQue100 = true;
			else isMaiorQue100 = false;
		}
		return isMaiorQue100;
	}
}
