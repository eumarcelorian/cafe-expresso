package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemPedidoTest {

    @Test
    public void naoDevePermitirQuantidadeZero() {
        Produto cafe = new Produto("Café", 5.0);

        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(cafe, 0);
        });
    }

    @Test
    public void naoDevePermitirQuantidadeNegativa() {
        Produto cafe = new Produto("Café", 5.0);

        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(cafe, -1);
        });
    }
}