import static java.lang.Thread.sleep;

public class RolaDados
{
    private int num_dados;  // Número de dados
    private Dado[] dados;   // Array dos dados

    public RolaDados(int n) // n = número de dados
    {
        // Inicializa array de tamanho n
        dados = new Dado[n];

        // Inicializa cada dado
        for (int i = 0; i < n; i++)
        {
            dados[i] = new Dado();
            try
            {
                // Sleep de 100 mls para garantir que cada seed seja diferente
                sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        num_dados = n;
    }

    public int[] rolar()
    {
        // Rola cada dado e retorna os valores em um array de int
        int[] lados = new int[num_dados];
        for (int i = 0; i < num_dados; i++)
        {
            lados[i] = dados[i].rolar();
        }
        return lados;
    }

    public int[] rolar(boolean[] quais)
    {
        int[] lados = new int[num_dados];
        for (int i = 0; i < num_dados; i++) // Para cada dado
        {
            if (quais[i] == true)           // Se marcado como true -> rola o dado
                lados[i] = dados[i].rolar();
            else                            // Senao pega o lado já existente
                lados[i] = dados[i].getLado();
        }
        return lados;
    }

    public int[] rolar(java.lang.String s)
    {
        boolean[] lados = new boolean[num_dados];   // Monta um array de boolean de acordo com a string s recebida
        String[] nums = s.split(" ");        // Separa os números da string
        for (String n : nums)                       // Para cada num da string define o valor da posição no array
        // lados como true
        {
            int aux = Integer.parseInt(n);
            lados[aux - 1] = true;
        }

        return rolar(lados);    // Retorna a resposta da chamada do método rolar() onde o parametro é um array booleano
    }

    @Override
    public java.lang.String toString()
    {
        String res = "\t";
        String p1 = "", p2 = "", p3 = "", p4 = "", p5 = "";
        for (int i = 0; i < num_dados; i++)
        {
            res += i+1 + "\t\t\t\t";
            String[] aux = dados[i].toString().split("\n");
            p1 += aux[0] + "\t\t";
            p2 += aux[1] + "\t\t";
            p3 += aux[2] + "\t\t";
            p4 += aux[3] + "\t\t";
            p5 += aux[4] + "\t\t";
        }
        res += "\n" + p1 + "\n" + p2 + "\n" + p3 + "\n" + p4 + "\n" + p5;

        return res;
    }

    public static void main(java.lang.String[] args) throws java.lang.Exception
    {
        RolaDados rd = new RolaDados(10);
        rd.rolar();
        System.out.println(rd.toString());
    }
}
