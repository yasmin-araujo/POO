import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacarTest
{
    private Placar pl;

    @Before
    public void setup() {
        pl = new Placar();
    }

    @Test
    public void testAdd()
    {
        pl.add(1, new int[] {1, 2, 3, 4, 5} );
        int k = pl.getScore();
        assertEquals(1, k);
    }

    @Test
    public void testAddFull()
    {
        pl.add(7, new int[] {1, 1, 1, 5, 5} );
        int k = pl.getScore();
        assertEquals(15, k);
    }

    @Test
    public void testAddSequencia()
    {
        pl.add(8, new int[] {1, 2, 3, 4, 5} );
        int k = pl.getScore();
        assertEquals(20, k);
    }

    @Test
    public void testAddQuadra()
    {
        pl.add(9, new int[] {1, 1, 1, 1, 5} );
        int k = pl.getScore();
        assertEquals(30, k);
    }

    @Test
    public void testAddQuina()
    {
        pl.add(10, new int[] {1, 1, 1, 1, 1} );
        int k = pl.getScore();
        assertEquals(40, k);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFailAdd()
    {
        pl.add(1, new int[] {1, 2, 3, 4, 5} );
        pl.add(1, new int[] {1, 2, 3, 4, 5} );
    }

    @Test
    public void testGetScoreVazio()
    {
        int k = pl.getScore();
        assertEquals(0, k);
    }

    @Test
    public void testGetScoreCheio() {
        pl.add(1, new int[] {1, 2, 3, 4, 5} );
        pl.add(2, new int[] {1, 2, 3, 4, 5} );
        pl.add(3, new int[] {1, 2, 3, 4, 5} );
        pl.add(4, new int[] {1, 2, 3, 4, 5} );
        pl.add(5, new int[] {1, 2, 3, 4, 5} );
        pl.add(6, new int[] {1, 2, 3, 4, 5} );
        pl.add(7, new int[] {1, 2, 3, 4, 5} );
        pl.add(8, new int[] {1, 2, 3, 4, 5} );
        pl.add(9, new int[] {1, 2, 3, 4, 5} );
        pl.add(10, new int[] {1, 2, 3, 4, 5} );
        int k = pl.getScore();
        assertEquals(35, k);
    }

    @Test
    public void testToString()
    {
        String res = "\n +----------------------------------+\n" +
                " |     1     |    (7)    |   (4)    |\n" +
                " +----------------------------------+\n" +
                " |    (2)    |    (8)    |   (5)    |\n" +
                " +----------------------------------+\n" +
                " |    (3)    |    (9)    |   (6)    |\n" +
                " +----------------------------------+\n" +
                "             |    (10)   |\n" +
                "             +-----------+ ";

        pl.add(1, new int[] {1, 2, 3, 4, 5} );
        assertEquals(res, pl.toString());
    }
}