package strategy.investimento;

public class TesteInvestimendo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.deposita(1000);
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		Conta conta3 = new Conta();
		conta3.deposita(1000);
		
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		Investimento conservador = new Conservador();
		
		RealizadorDeInvestimento realizadorDeInvestimento = new RealizadorDeInvestimento();
		realizadorDeInvestimento.calculaInvestimendo(conta1, moderado);
		realizadorDeInvestimento.calculaInvestimendo(conta2, arrojado);
		realizadorDeInvestimento.calculaInvestimendo(conta3, conservador);
	}
	
}
