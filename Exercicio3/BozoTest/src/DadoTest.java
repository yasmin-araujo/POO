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
    public void getLado()
    {
        assertEquals(0, d.getLado());
    }

    @Test
    public void rolar()
    {
        int k = d.rolar();
        boolean res = !(k < 1 || k > 6);
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
}