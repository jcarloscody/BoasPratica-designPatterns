package br.com.jos.loja.pedido.acoes;

import br.com.jos.loja.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados...");
	}

}
