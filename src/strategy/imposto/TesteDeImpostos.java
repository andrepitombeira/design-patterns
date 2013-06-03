package strategy.imposto;

public class TesteDeImpostos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Orcamento orcamento = new Orcamento(5000);
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
	}

}
