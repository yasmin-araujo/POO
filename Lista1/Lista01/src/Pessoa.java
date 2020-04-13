import java.util.Date;

public class Pessoa {
    private int tipo = 0;
    PessoaFisica pf = new PessoaFisica();
    PessoaJuridica pj = new PessoaJuridica();

    Pessoa(String nome, Date data_nasc, int cpf) {
        this.tipo = 1;
        pf.setNome(nome);
        pf.setData_nasc(data_nasc);
        pf.setCpf(cpf);
    }

    Pessoa(String nome, String endereco, int cnpj)
    {
        this.tipo = 2;
        pj.setNome(nome);
        pj.setEndereco(endereco);
        pj.setCnpj(cnpj);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        if(tipo == 1)
            return pf.getNome();
        else
            return pj.getNome();
    }

    public void imprimeDados() {
        if(tipo == 1)
            pf.imprimeDado();
        else
            pj.imprimeDado();
    }
}
