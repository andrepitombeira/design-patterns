package chainofresponsability.conta;

import strategy.investimento.Conta;

public class SemFormato implements Resposta {

	@Override
	public void processa(Conta conta, Requisicao requisicao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProximo(Resposta proximo) {

	}
}
