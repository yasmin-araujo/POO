import java.util.Calendar;

public class Random {
    // parâmetros para geração
    private long p = 2147483648L; // uso do L - num extrapola tamanho max do inteiro - se não extrapola -> nao precisa, como nao tem perda de valor nao precisa do cast
    private long m = 843314861; // atribuindo valor int para long
    private long a = 453816693;

    private long xi = 1023; //seed

    public Random () {
        xi = Calendar.getInstance().getTimeInMillis();
    }

    public Random (long seed)
    {
        xi = seed;
    }

    public void setSeed(long seed)
    {
        xi = seed;
    }

    public double getRand()
    {
        // calcula o proximo valor xi
        // calcula valor entre 0 e 1, dividindo por p
        xi = (a + m * xi) % p;
        double d = xi; //promove p/ double
        return d / p;
    }

    public int getIntRand(int max)
    {
        // gera valor entre [0, 1)
        // multiplica por max
        double d = getRand() * max;
        return (int) d;
    }
}
