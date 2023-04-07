package impostor;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements ITipoImposto{

    public BigDecimal calcular(Orcamento orcamento){

                return orcamento.getValor().multiply(new BigDecimal(TipoImposto.ICMS.aliquota()));

    }
}
