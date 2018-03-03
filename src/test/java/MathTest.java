import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    private Math math = new Math(7, 10);
    @Test
    void add() {
        assertEquals(17,math.add());
    }
}