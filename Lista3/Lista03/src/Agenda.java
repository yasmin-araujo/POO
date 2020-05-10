import java.util.ArrayList;
import java.util.List;

public class Agenda
{
    private List<Pessoa> pessoas = new ArrayList<>();

    public void addContato(String CPF, String nome, String endereco, String data_nasc, String email,
                           String estado_civil)
    {
        if (pesquisaNome(nome) == -1 && pesquisaDoc(CPF) == -1)
        {
            Pessoa p = new PessoaFisica(CPF, nome, endereco, data_nasc, email, estado_civil);
            pessoas.add(p);
        }
    }

    public void addContato(String CNPJ, String nome, String endereco, String email, int inscricao_estadual,
                           String razao_social)
    {
        if (pesquisaNome(nome) == -1 && pesquisaDoc(CNPJ) == -1)
        {
            Pessoa p = new PessoaJuridica(CNPJ, nome, endereco, email, inscricao_estadual, razao_social);
            pessoas.add(p);
        }
    }

    public void removeContato(int index)
    {
        pessoas.remove(index);
    }

    public int pesquisaNome(String nome)
    {
        for (int i = 0; i < pessoas.size(); i++)
        {
            if (pessoas.get(i).getNome() == nome) return i;
        }
        return -1;
    }

    public int pesquisaDoc(String doc)
    {
        for (int i = 0; i < pessoas.size(); i++)
        {
            if (pessoas.get(i) instanceof PessoaFisica)
            {
                PessoaFisica pf = (PessoaFisica) pessoas.get(i);
                if (pf.getCPF() == doc)
                    return i;
            }
            else
            {
                PessoaJuridica pj = (PessoaJuridica) pessoas.get(i);
                if (pj.getCNPJ() == doc)
                    return i;
            }
        }
        return -1;
    }

    public void ordenaContatos()
    {
        // Coloca as pessoas físicas no começo
        pessoas.sort((p1, p2) -> {
            if (p1 instanceof PessoaFisica && p2 instanceof PessoaJuridica)
                return -1;
            else return 1;
        });

        // Ordena pelo CPF/CNPJ
        pessoas.sort((p1, p2) -> {
            // Caso sejam pessoas físicas ordena pelo CPF
            if (p1 instanceof PessoaFisica && p2 instanceof PessoaFisica)
                return Long.valueOf(((PessoaFisica) p1).getCPF()) > Long.valueOf(((PessoaFisica) p2).getCPF()) ? 1 : -1;

            // Caso sejam jurídicas ordena pelo CNPJ
            if (p1 instanceof PessoaJuridica && p2 instanceof PessoaJuridica)
                return Long.valueOf(((PessoaJuridica) p1).getCNPJ()) > Long.valueOf(((PessoaJuridica) p2).getCNPJ())
                        ? 1 : -1;

            // Senão mantem ordem
            return 0;
        });
    }

    public void visualizarContatos()
    {
        for (int i = 0; i < pessoas.size(); i++)
        {
            if (pessoas.get(i) instanceof PessoaFisica)
            {
                PessoaFisica pf = (PessoaFisica) pessoas.get(i);
                System.out.println("\nContato " + i + "\nCPF:" + pf.getCPF() + "\nNome: " + pf.getNome() + "\nEndere" +
                        "ço: " + pf.getEndereco() + "\nData de nascimento: " + pf.getData_nasc() + "\nEmail: " + pf.getEmail() + "\nEstado civil: " + pf.getEstado_civil());
            }
            else
            {
                PessoaJuridica pj = (PessoaJuridica) pessoas.get(i);
                System.out.println("\nContato " + i + "\nCNPJ:" + pj.getCNPJ() + "\nNome: " + pj.getNome() +
                        "\nEndereço: " + pj.getEndereco() + "\nEmail: " + pj.getEmail() + "\nInscrição estadual: " + pj.getInscricao_estadual() + "\nRazão social: " + pj.getRazao_social());
            }
        }
    }
}
