public class Pedido {
    private String nome_produto;
    private double valor;

    public Pedido(String nome_produto, double valor) {
        this.nome_produto = nome_produto;
        this.valor = valor;
    }

    public String getNome_produto()
    {
        return nome_produto;
    }

    public double getValor()
    {
        return valor;
    }

    public void setNome_produto(String nome_produto)
    {
        this.nome_produto = nome_produto;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
}
