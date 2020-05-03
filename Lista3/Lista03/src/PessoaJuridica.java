public class PessoaJuridica extends Pessoa
{
    private String CNPJ;
    private int inscricao_estadual;
    private String razao_social;

    PessoaJuridica(String CNPJ, String nome, String endereco, String email, int inscricao_estadual, String razao_social)
    {
        super(nome, endereco, email);
        this.CNPJ = CNPJ;
        this.inscricao_estadual = inscricao_estadual;
        this.razao_social = razao_social;
    }

    public void setCNPJ(String CNPJ)
    {
        this.CNPJ = CNPJ;
    }

    public void setInscricao_estadual(int inscricao_estadual)
    {
        this.inscricao_estadual = inscricao_estadual;
    }

    public void setRazao_social(String razao_social)
    {
        this.razao_social = razao_social;
    }

    public String getCNPJ()
    {
        return CNPJ;
    }

    public int getInscricao_estadual()
    {
        return inscricao_estadual;
    }

    public String getRazao_social()
    {
        return razao_social;
    }
}
