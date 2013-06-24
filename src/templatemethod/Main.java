package templatemethod;

import strategy.imposto.Imposto;
import strategy.imposto.Orcamento;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600.00);
		Orcamento orcamento2 = new Orcamento(200.00);
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		System.out.println(icpp.calcula(orcamento));
		System.out.println(ikcv.calcula(orcamento2));
	}

}
