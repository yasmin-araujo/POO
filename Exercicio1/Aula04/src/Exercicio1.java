import java.io.IOException;

public class Exercicio1 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Digite a primeira semente: ");
        long s1 = EntradaTeclado.leInt();
        System.out.println("Digite a segunda semente: ");
        long s2 = EntradaTeclado.leInt();

        Random r1 = new Random(s1);
        Random r2 = new Random(s2);

        int num1;
        int num2;

        int it = 0;

        do
        {
            num1 = r1.getIntRand(500);
            num2 = r2.getIntRand(500);
            it++;
        } while (num1 != num2);

        System.out.println("Número: " + num1);
        System.out.println("Iterações: " + it);
    }
}
