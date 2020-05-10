public class Produto
{
    private int codigo;
    private int qtd;
    private String nome;

    Produto(int codigo, int qtd, String nome)
    {
        this.codigo = codigo;
        this.qtd = qtd;
        this.nome = nome;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public void setQtd(int qtd)
    {
        this.qtd = qtd;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public int getQtd()
    {
        return qtd;
    }

    public String getNome()
    {
        return nome;
    }

    public void aumentaQtd(int qtd)
    {
        this.qtd += qtd;
    }
}
