import java.util.ArrayList;

public class Mesa
{
    private int num;
    private String nome_cliente;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    Mesa(int num, String nome_cliente)
    {
        this.num = num;
        this.nome_cliente = nome_cliente;
    }

    public int getNum()
    {
        return num;
    }

    public String getNome_cliente()
    {
        return nome_cliente;
    }

    public ArrayList<Pedido> getPedidos()
    {
        return pedidos;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public void setNome_cliente(String nome_cliente)
    {
        this.nome_cliente = nome_cliente;
    }

    public void setPedidos(ArrayList<Pedido> pedidos)
    {
        this.pedidos = pedidos;
    }

    public void addPedido(String nome_produto, double valor)
    {
        Pedido p = new Pedido(nome_produto, valor);
        pedidos.add(p);
    }

    public void gerarConta()
    {
        double total = 0;
        System.out.println("Conta de " + nome_cliente + " - Mesa " + num + "\n");
        for (Pedido p : pedidos)
        {
            System.out.println("Item: " + p.getNome_produto() + "\t\t\tValor: " + p.getValor());
            total += p.getValor();
        }
        System.out.println("\nTotal: " + total + "\n\n");
    }
}