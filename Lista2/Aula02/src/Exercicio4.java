import java.io.IOException;

public class Exercicio4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite um número: ");
        int n = EntradaTeclado.leInt();
        int x = n / 2;
        int r1;
        double r;
        boolean flag = true;
        int i = 2;
        for (i = 2; i <= x; i++) {
            r = (double) n / (double)i;
            r1 = n / i;
            if (r == r1) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("O número é primo");
        }
        else
            System.out.println("O menor divisor é: " + i);
    }
}
