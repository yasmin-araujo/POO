import java.io.IOException;

public class Exercicio8 {
    private static double func(double x) {
        return (x*x*x-x*x-13*x+8);
    }
    private static double derivative(double x) {
        return (3*x*x-2*x-13);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o chute inicial: ");
        double x0 = EntradaTeclado.leDouble();
        double x = 0;
        int iterates = 0;
        while(Math.abs(func(x0)) >= 0.0000001)
        {
            iterates++;
            x = x0 - (func(x0)/derivative(x0));
            x0 = x;
        }

        System.out.println("A raíz é: " + x);
        System.out.println("Número de iterações: " + iterates);
    }
}
