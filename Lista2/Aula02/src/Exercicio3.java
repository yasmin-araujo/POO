public class Exercicio3 {
    public static void main(String[] args) {
        int n = 0;

        System.out.println("Digite o número de linhas: ");
        while (true)
        {
            try
            {
                n = EntradaTeclado.leInt();
                break;
            } catch (Exception e)
            {
                System.out.println("Digite novamente: ");
            }
        }

        for (int i = n; i >= 1; i--)
        {
            for (int x = n - i; x >= 1; x--)
            {
                System.out.print(" ");
            }
            for (int x = i; x >= 1; x--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
