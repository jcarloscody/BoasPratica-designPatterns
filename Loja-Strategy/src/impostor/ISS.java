package impostor;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements ITipoImposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento){

                return orcamento.getValor().multiply(new BigDecimal(TipoImposto.ISS.aliquota()));

    }
}
