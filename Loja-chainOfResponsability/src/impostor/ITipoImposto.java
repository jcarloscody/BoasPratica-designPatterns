package impostor;

import orcamento.Orcamento;

import java.math.BigDecimal;

public interface ITipoImposto {
    BigDecimal calcular(Orcamento orcamento);
}
