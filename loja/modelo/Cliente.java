package modelo;

class Cliente {
    private String nome_cliente;
    private int idade_cliente;

    public Cliente(String nome_cliente, int idade_cliente) {
        this.nome_cliente = nome_cliente;
        this.idade_cliente = idade_cliente;
    }

    public String getNomeCliente() {
        return nome_cliente;
    }

    public int getIdadeCliente() {
        return idade_cliente;
    }

    public boolean ehMaiorDeIdade(){
        if (idade_cliente >= 18) {
            return true;
        } else {
            return false;
        }
    }
}