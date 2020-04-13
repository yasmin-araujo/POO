public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite o número de linhas: ");
        int n = 0;
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
            for (int x = i; x >= 1; x--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
