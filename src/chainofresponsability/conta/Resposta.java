package chainofresponsability.conta;

import strategy.investimento.Conta;

public interface Resposta {
	
	void processa(Conta conta, Requisicao requisicao);
	
	void setProximo(Resposta proximo);
}
