package chainofresponsability.conta;

import strategy.investimento.Conta;

public class CSV implements Resposta {

	private Resposta proximo;

	@Override
	public void processa(Conta conta, Requisicao requisicao) {
		if(requisicao.getFormato().equals(Formato.CSV)) {
			System.out.println("CSV");
		}else {
			proximo.processa(conta, requisicao);
		}
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
	}

}
