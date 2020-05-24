public class Placar
{
    // Valores iniciais das pontuações de cada posição do placar
    private String[] p = {"(1)", "(2)", "(3)", "(4)", "(5)", "(6)", "(7)", "(8)", "(9)", "(10)"};

    public Placar()
    {

    }

    // Método para contar número de dados com o mesmo valor de 'num'
    private int achar(int num, int[] dados)
    {
        int count = 0;
        for (int d : dados) // Para cada dado
        {
            if (d == num)   // Confere se ele tem o valor de 'num'
                count++;
        }
        return count;
    }

    public void add(int posicao, int[] dados) throws java.lang.IllegalArgumentException
    {
        // Erro caso posição já esteja ocupada
        if (!p[posicao - 1].contains("("))
            throw new IllegalArgumentException();

        int count = 0;
        int score = 0;

        // Contabilização dos pontos de acordo com a posição
        switch (posicao)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                count = achar(posicao, dados);  // Num de dados com valor = posição
                score = posicao * count;
                break;
            case 7:      // Full
                if (achar(dados[0], dados) + achar(dados[1], dados) == 5 || achar(dados[0], dados) + achar(dados[2],
                        dados) == 5 || achar(dados[0], dados) + achar(dados[3], dados) == 5)
                    score = 15;
                break;
            case 8:     // Sequencia
                if (achar(2, dados) == 1 && achar(3, dados) == 1 && achar(4, dados) == 1 && achar(5, dados) == 1)
                    score = 20;
                break;
            case 9:     // Quadra
                if (achar(dados[0], dados) == 4 || achar(dados[1], dados) == 4)
                    score = 30;
                break;
            case 10:    // Quina
                if (achar(dados[0], dados) == 5)
                    score = 40;
                break;
        }
        p[posicao - 1] = " " + score;     // Insere o score na posição escolhida
        if (score < 10)
            p[posicao - 1] += " ";
    }

    public int getScore()
    {
        int score = 0;
        for (int i = 0; i < 10; i++)
        {
            try
            {
                //  Calculo do score total - apenas posições que podem ser convertidas para inteiro são
                //  contabilizadas (todas as que tem pontuação)
                int aux = Integer.parseInt(p[i].replaceAll(" ", ""));
                score += aux;
            } catch (Exception e)
            {

            }
        }
        return score;
    }

    @Override
    public java.lang.String toString()
    {
        String res = "\n +----------------------------------+\n" +
                " |    " + p[0] + "    |    " + p[6] + "    |   " + p[3] + "    |\n" +
                " +----------------------------------+\n" +
                " |    " + p[1] + "    |    " + p[7] + "    |   " + p[4] + "    |\n" +
                " +----------------------------------+\n" +
                " |    " + p[2] + "    |    " + p[8] + "    |   " + p[5] + "    |\n" +
                " +----------------------------------+\n" +
                "             |    " + p[9] + "   |\n" +
                "             +-----------+ ";
        return res;
    }
}
