public class Dado
{
    private int n;        // Número de lados
    private int lado = 0; // Úlitmo lado selecionado

    Random rdm = new Random();

    public Dado()
    {
        n = 6;
    }

    public Dado(int n)
    {
        this.n = n;
    }

    public int getLado()
    {
        return lado;
    }

    public int rolar()
    {
        // Gera um número aleatório [1,n]
        lado = rdm.getIntRand(n) + 1;
        return lado;
    }

    @Override
    public java.lang.String toString()
    {
        switch (lado)
        {
            case 1:
                return "+---------+\n" +
                        "|         |\n" +
                        "|    O    |\n" +
                        "|         |\n" +
                        "+---------+";
            case 2:
                return "+---------+\n" +
                        "|  O      |\n" +
                        "|         |\n" +
                        "|      O  |\n" +
                        "+---------+";
            case 3:
                return "+---------+\n" +
                        "|  O      |\n" +
                        "|    O    |\n" +
                        "|      O  |\n" +
                        "+---------+";
            case 4:
                return "+---------+\n" +
                        "|  O   O  |\n" +
                        "|         |\n" +
                        "|  O   O  |\n" +
                        "+---------+";
            case 5:
                return "+---------+\n" +
                        "|  O   O  |\n" +
                        "|    O    |\n" +
                        "|  O   O  |\n" +
                        "+---------+";
            case 6:
                return "+---------+\n" +
                        "|  O   O  |\n" +
                        "|  O   O  |\n" +
                        "|  O   O  |\n" +
                        "+---------+";
            default:
                return "Lado inválido" + lado;
        }
    }

    public static void main(java.lang.String[] args)
    {
        Dado dado = new Dado();
        dado.rolar();
        System.out.println(dado.getLado());
        System.out.println(dado.toString());
    }
}
