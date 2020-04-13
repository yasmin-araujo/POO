import java.util.Date;

public class Agenda {
    Pessoa[] ps = new Pessoa[10];

    void armazenaPessoa(String nome, Date data_nasc, int cpf)
    {
        Pessoa p = new Pessoa(nome, data_nasc, cpf);
        armazena(p);
    }
    void armazenaPessoa(String nome, String endereco, int cnpj)
    {
        Pessoa p = new Pessoa(nome, endereco, cnpj);
        armazena(p);
    }

    private void armazena(Pessoa p)
    {
        int i = 0;
        while(ps[i] != null) i++;
        ps[i] = p;
    }

    void removePessoa(String nome)
    {
        int i = buscaPessoa(nome);
        if(i >= 0)
        {
            ps[i] = null;
        }
    }

    // informa em que posição da agenda está a pessoa
    int buscaPessoa(String nome)
    {
        int i = 0;
        while(i < 10 && ( ps[i] == null || (ps[i].getNome() != nome)))
            i++;

        if(ps[i] != null && ps[i].getNome() == nome)
            return i;
        else
            return -1;
    }

    // imprime os dados de todas as pessoas da agenda
    void imprimeAgenda()
    {
        int i = 0;
        while(i < 10)
        {
            if(ps[i] != null)
                ps[i].imprimeDados();
            i++;
        }
        System.out.println("\n");
    }

    // imprime os dados da pessoa que está na posição “i” da agenda
    void imprimePessoa(int i)
    {
        ps[i].imprimeDados();
    }
}
