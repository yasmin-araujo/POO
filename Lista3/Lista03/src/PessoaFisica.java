public class PessoaFisica extends Pessoa
{
    private String CPF;
    private String data_nasc;
    private String estado_civil;

    PessoaFisica(String CPF, String nome, String endereco, String data_nasc, String email, String estado_civil)
    {
        super(nome, endereco, email);
        this.CPF = CPF;
        this.data_nasc = data_nasc;
        this.estado_civil = estado_civil;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public void setData_nasc(String data_nasc)
    {
        this.data_nasc = data_nasc;
    }

    public void setEstado_civil(String estado_civil)
    {
        this.estado_civil = estado_civil;
    }

    public String getCPF()
    {
        return CPF;
    }

    public String getData_nasc()
    {
        return data_nasc;
    }

    public String getEstado_civil()
    {
        return estado_civil;
    }
}
