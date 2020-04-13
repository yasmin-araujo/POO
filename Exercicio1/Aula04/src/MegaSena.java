import java.io.IOException;

public class MegaSena {
    public static void main(String[] args) throws IOException {
        // cria um objeto para gerar numeros aleatorios

        System.out.println("Digite um número para a semente: ");
        int seed = EntradaTeclado.leInt();
        Random r = new Random();

//        r.setSeed(seed);

        for(int i = 0; i < 6; i++)
        {
            // pega um numero aleatorio entre 1 e 60
            // mostra o numero
            System.out.println(r.getIntRand(60) + 1);
        }
    }
}
