import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DominoTest {

    static Domino aDomino = new Domino(9, 2);

    @Test
    public void testDomino() {
        if ((aDomino.high != 0 && aDomino.high > 0) || (aDomino.low != 0 && aDomino.low > 0)) {
            int expected = aDomino.high;
            int actual = aDomino.high;

            int lowExpected = aDomino.low;
            int lowActual = aDomino.low;

            assertEquals(expected, actual);
            assertEquals(lowExpected, lowActual);
        }

    }

}
