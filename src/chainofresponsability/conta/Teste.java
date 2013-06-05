package chainofresponsability.conta;

import strategy.investimento.Conta;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(1000);
		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
		ProcessaRequisicao processaRequisicao = new ProcessaRequisicao();
		processaRequisicao.processaRequisicao(conta, requisicao);
	}

}
