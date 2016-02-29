package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void testeValorVenda1000Retorna50() {
		
		double valorVenda = 1000;
		double esperado = 50;
		
		CalculadoraComissao calc = new CalculadoraComissao();
		double retorno = calc.calcular(valorVenda);
		
		assertEquals(esperado, retorno, 0);
	}
	
	@Test
	public void testeValorVenda10000Retorna500() {
		
		double valorVenda = 10000;
		double esperado = 500;
		
		CalculadoraComissao calc = new CalculadoraComissao();
		double retorno = calc.calcular(valorVenda);
		
		assertEquals(esperado, retorno, 0);
	}
	@Test
	public void testeValorVenda20000Retorna1200() {
		
		double valorVenda = 20000;
		double esperado = 1200;
		
		CalculadoraComissao calc = new CalculadoraComissao();
		double retorno = calc.calcular(valorVenda);
		
		assertEquals(esperado, retorno, 0);
	}
	
	@Test
	public void testeValorVenda55_59Retorna2_77() {
		
		double valorVenda = 55.59;
		double esperado = 2.77;
		
		CalculadoraComissao calc = new CalculadoraComissao();
		double retorno = calc.calcular(valorVenda);
		
		assertEquals(esperado, retorno, 0);
	}
}
