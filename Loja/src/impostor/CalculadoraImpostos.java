package impostor;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {
    public BigDecimal calcular(Orcamento orcamento, ITipoImposto tipoImposto){
        return  tipoImposto.calcular(orcamento);

        }
    }

