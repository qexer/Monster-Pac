//TODO: package unit;
//TODO: import Position class; ha átrakod majd más helyre;
import org.junit.Test;
import static org.junit.Assert.*;

public class PositionTest {
    Position pos1 = new Position(-4, -6);
    Position pos2 = new Position(100, 2000);

    @Test
    public void TestGetX(){
        assertEquals(-4, pos1.getX());
        assertEquals(100, pos2.getX());
    }

    @Test
    public void TestGetY(){
        assertEquals(-6, pos1.getY());
        assertEquals(2000, pos2.getY());
    }

    @Test
    public void TestSetX(){
        int testnumber1 = 10;
        int testnumber2 = -500;
        pos1.setX(testnumber1);
        pos2.setX(testnumber2);

        assertTrue(pos1.getX() == testnumber1);
        assertTrue(pos2.getX() == testnumber2);
        assertFalse(pos1.getX() == testnumber2);
    }

    @Test
    public void TestSetY(){
        int testnumber1 = 10;
        int testnumber2 = -500;
        pos1.setY(testnumber1);
        pos2.setY(testnumber2);

        assertTrue(pos1.getY() == testnumber1);
        assertTrue(pos2.getY() == testnumber2);
        assertFalse(pos1.getY() == testnumber2);
    }

}
