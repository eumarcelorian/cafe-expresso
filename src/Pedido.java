import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status = StatusPedido.PENDENTE;

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void pagar() {
        if (status == StatusPedido.PENDENTE) {
            status = StatusPedido.PAGO;
        }
    }

    public void iniciarPreparo() {
        if (status == StatusPedido.PAGO) {
            status = StatusPedido.EM_PREPARO;
        }
    }

    public void finalizar() {
        if (status == StatusPedido.EM_PREPARO) {
            status = StatusPedido.FINALIZADO;
        }
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}