package chainofresponsability.conta;

import strategy.investimento.Conta;

public class ProcessaRequisicao {

	public void processaRequisicao(Conta conta, Requisicao requisicao) {
		Resposta xml = new XML();
        Resposta csv = new CSV();
        Resposta porcento = new Porcento();
        Resposta semFormato = new SemFormato();
        xml.setProximo(csv);
        csv.setProximo(porcento);
        porcento.setProximo(semFormato);
        xml.processa(conta, requisicao);
	}
}
