package modelo;
package servico;

public class Aplicacao {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Pedro", 18);

        Produto produto = new Produto("New Balance", 1240);

        produto.aplicarDesconto(10);

        ItemPedido item = new ItemPedido(produto, 2);

        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(item);

        PedidoServico servico = new PedidoServico();

        double total = servico.calcularTotalPedido(pedido);
        System.out.println("Total calculado: R$ " + total);

        System.out.println("\nResumo do Pedido:");
        servico.exibirResumoPedido(pedido);
    }
}