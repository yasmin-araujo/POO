public class Exercicio1
{
    public static void main(String[] args)
    {
        Agenda agd = new Agenda();
        agd.addContato("6666555598", "Empresa2", "Sanca", "empresa2@email.com", 12345, "Empresaa2");
        agd.addContato("12345678910", "Yasmin", "Sao Carlos", "22/06/2001", "yasminoa@hotmail.com", "Solteira");
        agd.addContato("1111122223", "Empresa", "Sanca", "empresa@email.com", 1234, "Empresaa");
        agd.addContato("98745632142", "Laura", "Sao Carlos", "07/09/2000", "laura@hotmail.com", "Solteira");
        System.out.println( agd.pesquisaDoc("12345678910") );
        System.out.println( agd.pesquisaNome("Empresa") );
        agd.visualizarContatos();
        agd.ordenaContatos();
        agd.visualizarContatos();
        agd.removeContato( agd.pesquisaNome("Yasmin"));
        agd.removeContato( agd.pesquisaDoc("1111122223"));
    }
}
