import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {
	private double valor;
	private final List<Item> items;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.items = new ArrayList<Item>();
	}
	
	public double getValor() {
		return valor;
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}
}
