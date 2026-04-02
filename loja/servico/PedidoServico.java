import modelo.Pedido;
import modelo.ItemPedido;

public class PedidoServico {

    public double calcularTotalPedido(Pedido pedido) {
        double total = 0;

        for (ItemPedido item : pedido.getItens()) {
            total += item.calcularTotal();
        }

        return total;
    }

    public void exibirResumoPedido(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente().getNomeCliente());

        for (ItemPedido item : pedido.getItens()) {
            System.out.println("Produto: " + item.getProduto().getNome());
            System.out.println("Quantidade: " + item.getQuantidade());
        }

        double total = calcularTotalPedido(pedido);
        System.out.println("Total do Pedido: R$ " + total);
    }
}