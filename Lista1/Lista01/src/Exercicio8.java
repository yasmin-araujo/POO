public class Exercicio8
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[110];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 90 + i;
        }

        for (Integer i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
