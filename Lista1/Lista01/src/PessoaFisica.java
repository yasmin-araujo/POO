import java.util.Date;

public class PessoaFisica {
    private String nome;
    private Date data_nasc;
    private int cpf;

    public Date getData_nasc() {
        return data_nasc;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeDado() {
        System.out.println("Nome: " + nome + "\nData nasc: " + data_nasc + "\nCPF: " + cpf + "\n");
    }
}
