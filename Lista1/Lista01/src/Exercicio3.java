import java.util.Date;

public class Exercicio3 {
    public static void main(String[] args) {

        Agenda agd = new Agenda();

        Date dt = new Date(12/12/2013);

        agd.armazenaPessoa("Camila", "bobona", 40578965);
        agd.armazenaPessoa("Laura", dt, 40578965);
        agd.armazenaPessoa("Luiza", dt, 40578965);
        agd.armazenaPessoa("Ana", "ccccc", 40578965);
        agd.armazenaPessoa("Flavio", "dddd", 40578965);

        agd.imprimeAgenda();

        agd.removePessoa("Luiza");

        agd.imprimeAgenda();

        try
        {
            agd.imprimePessoa(agd.buscaPessoa("Luiza"));
        } catch (Exception e)
        {
            System.out.println("Pessoa não cadastrada\n");
        }

        try
        {
            agd.imprimePessoa(agd.buscaPessoa("Laura"));
        } catch (Exception e)
        {
            System.out.println("Pessoa não cadastrada\n");
        }

        try
        {
            agd.imprimePessoa(agd.buscaPessoa("Ana"));
        } catch (Exception e)
        {
            System.out.println("Pessoa não cadastrada\n");
        }
    }
}
