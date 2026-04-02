package modelo;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        } else {
            System.err.println("O preço não pode ser negativo!");
        }
    }

    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}