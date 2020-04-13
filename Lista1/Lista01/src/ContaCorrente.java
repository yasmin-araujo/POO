public class ContaCorrente
{
    private int num_conta;
    private String nome_banco;
    private String nome_cliente;
    private double saldo;

    ContaCorrente(int num_conta, String nome_banco, String nome_cliente, double saldo)
    {
        cadastrarConta(num_conta, nome_banco, nome_cliente, saldo);
    }

    public void setNum_conta(int num_conta)
    {
        this.num_conta = num_conta;
    }

    public void setNome_banco(String nome_banco)
    {
        this.nome_banco = nome_banco;
    }

    public void setNome_cliente(String nome_cliente)
    {
        this.nome_cliente = nome_cliente;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public int getNum_conta()
    {
        return num_conta;
    }

    public String getNome_banco()
    {
        return nome_banco;
    }

    public void cadastrarConta(int num_conta, String nome_banco, String nome_cliente, double saldo)
    {
        this.num_conta = num_conta;
        this.nome_banco = nome_banco;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor)
    {
        saldo += valor;
    }

    public void sacar(double valor)
    {
        saldo += valor;
    }
}
