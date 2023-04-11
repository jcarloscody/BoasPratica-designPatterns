package br.com.jos.loja.imposto;

import java.math.BigDecimal;

import br.com.jos.loja.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
