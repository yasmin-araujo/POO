public class Exercicio6
{
    public static void main(String[] args)
    {
        String str;
        boolean flag = true;
        int num = 0;
        String[] nums = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};

        System.out.println("Digite uma string: ");
        while (true)
        {
            try
            {
                str = EntradaTeclado.leString();
                break;
            } catch (Exception e)
            {
                System.out.println("Digite a string novamente: ");
            }
        }

        char[] reverse = str.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--)
        {
            System.out.print(reverse[i]);
        }

        for (int i = 0, j = reverse.length - 1; i < j; i++, j--)
        {
            if (reverse[i] != reverse[j]) flag = false;
        }

        if (flag)
            System.out.println("\nÉ palíndromo");
        else
            System.out.println("\nNão é palíndromo");

        System.out.println("\n Digite um número: ");
        while (true)
        {
            try
            {
                num = EntradaTeclado.leInt();
                break;
            } catch (Exception e)
            {
                System.out.println("Digite o número novamente: ");
            }
        }

        String str_num = String.valueOf(num);

        for (Character i : str_num.toCharArray())
        {
            int a = Integer.parseInt(String.valueOf(i));
            System.out.print(nums[a] + " ");
        }
    }
}
