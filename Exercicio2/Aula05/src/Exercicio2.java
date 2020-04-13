public class Exercicio2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Camila", 18, 1.60);
        Pessoa p2 = new Pessoa("Laura", 18, 1.55);
        Pessoa p3 = new Pessoa("Luiza", 18, 1.56);
        Pessoa p4 = new Pessoa("Ana", 18, 1.65);
        Pessoa p5 = new Pessoa("Flavio", 19, 1.70);

        Agenda agd = new Agenda();

        agd.armazenaPessoa(p1.getNome(), p1.getIdade(), p1.getAltura());
        agd.armazenaPessoa(p2);
        agd.armazenaPessoa(p3);
        agd.armazenaPessoa(p4);
        agd.armazenaPessoa(p5);

        agd.imprimeAgenda();

        agd.removePessoa("Luiza");

        agd.imprimeAgenda();

        try
        {
            agd.imprimePessoa(agd.buscaPessoa("Luiza"));
        } catch (Exception e)
        {
            System.out.println("Pessoa não cadastrada");
        }
    }
}
