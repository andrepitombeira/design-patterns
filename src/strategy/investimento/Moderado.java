package strategy.investimento;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double calcula(Conta conta) {
		Random random = new Random();
		if(random.nextInt(2) == 0) {
			return conta.getSaldo() * 0.025;
		}
		else return conta.getSaldo() * 0.007;
	}

}
