import impostor.CalculadoraImpostos;
import impostor.ICMS;
import impostor.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(10));
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        ICMS icms = new ICMS();
        System.out.println(calculadoraImpostos.calcular(orcamento, icms ));


    }
}
