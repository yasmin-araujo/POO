public class Exercicio9
{
    public static void main(String[] args)
    {
        Integer[][] mat = {
                {2, 5, 3, 6, 9},
                {5, 8, 9, 7, 4},
                {9, 6, 3, 7, 5}};

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                if (mat[i][j] % 2 == 0)
                    mat[i][j] = 1;
                else
                    mat[i][j] = -1;
            }
        }

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
