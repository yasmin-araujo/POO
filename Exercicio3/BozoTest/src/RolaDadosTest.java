import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RolaDadosTest
{
    private RolaDados rd;

    @Before
    public void setUp()
    {
        rd = new RolaDados(5);
    }

    @Test
    public void testRolar1()
    {
        int[] lados = rd.rolar();
        boolean res = true;
        for (int i = 0; i < 5; i++)
        {
            int k = lados[i];
            res = (!(k < 1 || k > 6) && res);
        }
        assertTrue(res);
    }

    @Test
    public void testRolar2()
    {
        boolean[] aux = new boolean[5];
        rd.rolar();
        aux[0] = true;
        aux[2] = true;
        aux[4] = true;
        int[] lados = rd.rolar(aux);
        boolean res = true;
        for (int i = 0; i < 5; i++)
        {
            int k = lados[i];
            System.out.println(k);
            res = (!(k < 1 || k > 6) && res);
        }
        assertTrue(res);
    }

    @Test
    public void testRolar3()
    {
        int[] lados = rd.rolar("1 2 3 4 5");
        boolean res = true;
        for (int i = 0; i < 5; i++)
        {
            int k = lados[i];
            res = (!(k < 1 || k > 6) && res);
        }
        assertTrue(res);
    }

    @Test
    public void testToString()
    {
        int[] lados = {1, 1, 1, 1, 1};
        rd.setDados(lados);
        String dado = "+---------+\n" +
                "|         |\n" +
                "|    O    |\n" +
                "|         |\n" +
                "+---------+";
        String[] aux = dado.toString().split("\n");
        String p1 = "", p2 = "", p3 = "", p4 = "", p5 = "";
        String res = "\t";

        for (int i = 0; i < 5; i++)
        {
            res += i+1 + "\t\t\t\t";
            p1 += aux[0] + "\t\t";
            p2 += aux[1] + "\t\t";
            p3 += aux[2] + "\t\t";
            p4 += aux[3] + "\t\t";
            p5 += aux[4] + "\t\t";
        }
        res += "\n" + p1 + "\n" + p2 + "\n" + p3 + "\n" + p4 + "\n" + p5;
        assertEquals(res, rd.toString());
    }
}