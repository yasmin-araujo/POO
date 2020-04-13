import java.io.IOException;

public class Exercicio7 {
    private static double func(double x) {
        return (x*x*x-x*x-13*x+8);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Digite o intervalo inicial");
        System.out.println("a: ");
        double a = EntradaTeclado.leDouble();
        System.out.println("b: ");
        double b = EntradaTeclado.leDouble();

        int iteracoes = 0;

        double x = ((b-a)/2) + a; // ponto medio
        double r = func(x); // tem que ser 0

        while (Math.abs(r) >= 0.0000001)
        {
            iteracoes++;

            if((r > 0 && func(a) > 0) || r < 0 && func(a) < 0)
                a = x;
            else
                b = x;

            x = ((b - a) / 2) + a; // novo ponto medio
            r = func(x);
        }

        System.out.println("A raíz é: " + x);
        System.out.println("Número de iterações: " + iteracoes);

        //x*x*x-x*x-13x+8
    }
}
