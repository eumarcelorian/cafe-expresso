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
}