package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void naoDevePermitirPrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Café", -10.0);
        });
    }

    public void naoDevePermitirNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("", 10.0);
        });
    }
}
