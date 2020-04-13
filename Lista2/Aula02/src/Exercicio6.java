import java.io.IOException;

public class Exercicio6 {
    public static void main(String[] args) throws IOException {
        double n = 0;
        double max = 0;
        System.out.println("Digite 0 para encerrar: ");
        do
        {
            n = EntradaTeclado.leDouble();
            max = Math.max(max, n);
        } while(n != 0);

        System.out.println("Maior: " + max);
    }
}
