package model;

import model.Pedido;
import model.Produto;
import model.StatusPedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void deveCalcularTotalCorretamente() {
        Produto cafe = new Produto("Café", 5.0);
        Produto pao = new Produto("Pão", 3.0);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(cafe, 2); // 10
        pedido.adicionarItem(pao, 1);  // 3

        double total = pedido.calcularTotal();

        assertEquals(13.0, total);
    }

    @Test
    public void naoDevePermitirPularDiretoParaPreparo() {
        Pedido pedido = new Pedido();

        pedido.iniciarPreparo();

        assertEquals(StatusPedido.PENDENTE, pedido.getStatus());
    }

    @Test
    public void deveSeguirFluxoCompletoDoPedido() {
        Pedido pedido = new Pedido();

        pedido.pagar();
        assertEquals(StatusPedido.PAGO, pedido.getStatus());

        pedido.iniciarPreparo();
        assertEquals(StatusPedido.EM_PREPARO, pedido.getStatus());

        pedido.finalizar();
        assertEquals(StatusPedido.FINALIZADO, pedido.getStatus());
    }
}