import java.io.IOException;

public class Exercicio5 {

    private static boolean ehPrimo(int n, int x) {
        int r1;
        double r;
        int i = 2;
        boolean flag = true;
        for (i = 2; i <= x; i++) {
            r = (double) n / (double)i;
            r1 = n / i;
            if (r == r1) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Digite um número: ");
        int n = EntradaTeclado.leInt();
        int x = n/2;
        while(!ehPrimo(n, x))
        {
            n--;
            x = n/2;
        }
        System.out.println(n + " é primo");
    }
}
