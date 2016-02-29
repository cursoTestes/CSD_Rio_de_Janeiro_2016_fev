package br.com.k21;

public class CalculadoraComissao {

	private static final int _10000 = 10000;

	public double calcular(double valorVenda)
	{	double retorno;
	
		//calculando o valor <= 10000
		if (valorVenda <= _10000) {
			retorno = valorVenda * 0.05;
		} else {
			retorno = valorVenda * 0.06;
		}
		
		return arredondar(retorno);
	}

	private double arredondar(double retorno) {
		return Math.floor(retorno * 100)/100.0;
	}

}
