package chainofresponsability.desconto;

import strategy.imposto.Orcamento;

public class TesteDeDescontos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		Orcamento orcamento = new Orcamento(500.00);
		orcamento.adicionaItem(new Item("CANETA",250.00));
		orcamento.adicionaItem(new Item("LAPIS",250.00));
		
		double desconto = calculadorDeDesconto.calcula(orcamento);
		System.out.println(desconto);
	}
}
