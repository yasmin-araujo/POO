public class Exercicio1 {
    public static void main(String[] args) {
        boolean flag = true;
        double x = 0, x0 = 0;
        System.out.println("Digite um valor x: ");
        while (flag)
        {
            try
            {
                x = EntradaTeclado.leDouble();
                flag = false;
            } catch (Exception e)
            {
                flag = true;
                System.out.println("Digite novamente: ");
            }
        }
        System.out.println("Digite o chute inicial: ");
        while (!flag)
        {
            try
            {
                x0 = EntradaTeclado.leDouble();
                flag = true;
            } catch (Exception e)
            {
                flag = false;
                System.out.println("Digite novamente: ");
            }
        }

        double x1 = (x0 + (x / x0)) / 2;
        while (Math.abs(x1 - x0) >= 0.00000001)
        {
            x0 = x1;
            x1 = (x0 + (x / x0)) / 2;
        }

        System.out.println("A raiz é:" + x1);
    }
}
