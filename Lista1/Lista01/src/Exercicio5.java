public class Exercicio5
{
    public static void main(String[] args)
    {
        Mesa ms = new Mesa(01, "Marcelo");
        ms.addPedido("Coca", 4.50);
        ms.addPedido("Lasanha", 25.40);
        ms.gerarConta();

        Mesa ms2 = new Mesa(02, "Sara");
        ms2.addPedido("Suco", 5.50);
        ms2.addPedido("Estrogonofe", 18.50);
        ms2.gerarConta();
    }
}
