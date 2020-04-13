public class PessoaJuridica {
    private String nome;
    private String endereco;
    private int cnpj;

    public String getNome() {
        return nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimeDado() {
        System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nCNPJ: " + cnpj + "\n");
    }
}
