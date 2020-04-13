public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    Pessoa(String nome, int idade, double altura)
    {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public void setIdade (int idade)
    {
        this.idade = idade;
    }

    public void setAltura (double altura)
    {
        this.altura = altura;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public double getAltura()
    {
        return altura;
    }

    public void imprimeDados()
    {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura+"\n");
    }
}
