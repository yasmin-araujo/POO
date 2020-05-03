public class Pessoa
{
    private String nome;
    private String email;
    private String endereco;

    Pessoa(String nome, String endereco, String email)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNome()
    {
        return nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public String getEmail()
    {
        return email;
    }
}
