package chainofresponsability.desconto;

import strategy.imposto.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo); 
}
