package orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantItens;

    public Orcamento(BigDecimal valor, int quantItens) {
        this.valor = valor;
        this.quantItens = quantItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantItens() {
        return quantItens;
    }

    public void setQuantItens(int quantItens) {
        this.quantItens = quantItens;
    }
}
