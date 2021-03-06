import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DadoTest
{
    private Dado d;

    @Before
    public void setUp()
    {
        d = new Dado();
    }

    @Test
    public void testSetDadoN()
    {
        d = new Dado(7);
        int k;
        boolean res = true;
        for(int i = 0; i < 10; i++)
        {
            k = d.rolar();
            res = res && !(k < 1 || k > 7);
        }
        assertTrue(res);
    }

    @Test
    public void getLado()
    {
        assertEquals(0, d.getLado());
    }

    @Test
    public void rolar()
    {
        int k;
        boolean res = true;
        for(int i = 0; i < 10; i++)
        {
            k = d.rolar();
            res = res && !(k < 1 || k > 6);
        }
        assertTrue(res);
    }

    @Test
    public void testToString1()
    {
        String res = "+---------+\n" +
                "|         |\n" +
                "|    O    |\n" +
                "|         |\n" +
                "+---------+";
        d.setLado(1);
        assertEquals(res, d.toString());
    }

    @Test
    public void testToString2()
    {
        String res = "+---------+\n" +
                "|  O      |\n" +
                "|         |\n" +
                "|      O  |\n" +
                "+---------+";
        d.setLado(2);
        assertEquals(res, d.toString());
    }

    @Test
    public void testToString3()
    {
        String res = "+---------+\n" +
                "|  O      |\n" +
                "|    O    |\n" +
                "|      O  |\n" +
                "+---------+";
        d.setLado(3);
        assertEquals(res, d.toString());
    }

    @Test
    public void testToString4()
    {
        String res = "+---------+\n" +
                "|  O   O  |\n" +
                "|         |\n" +
                "|  O   O  |\n" +
                "+---------+";
        d.setLado(4);
        assertEquals(res, d.toString());
    }

    @Test
    public void testToString5()
    {
        String res = "+---------+\n" +
                "|  O   O  |\n" +
                "|    O    |\n" +
                "|  O   O  |\n" +
                "+---------+";
        d.setLado(5);
        assertEquals(res, d.toString());
    }

    @Test
    public void testToString6()
    {
        String res = "+---------+\n" +
                "|  O   O  |\n" +
                "|  O   O  |\n" +
                "|  O   O  |\n" +
                "+---------+";
        d.setLado(6);
        assertEquals(res, d.toString());
    }

    @Test
    public void testToStringDefault()
    {
        String res = "Lado inválido: 7";
        d.setLado(7);
        assertEquals(res, d.toString());
    }
}