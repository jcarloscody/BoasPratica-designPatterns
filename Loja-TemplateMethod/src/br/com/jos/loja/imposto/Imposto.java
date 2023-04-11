package br.com.jos.loja.imposto;

import java.math.BigDecimal;

import br.com.jos.loja.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
