public class Exercicio7
{
    static public int maiorValor(Integer[] num)
    {
        int max = num[0];
        int indice = 0;

        for (int i = 1; i < num.length; i++)
        {
            if(num[i] > max)
            {
                max = num[i];
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args)
    {
        Integer[] num = {1, 5, 6, 99, 8, 27, 99};
        System.out.println(maiorValor(num));
    }
}
