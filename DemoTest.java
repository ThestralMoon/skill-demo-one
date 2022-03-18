import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {

    @Test
    public void testSubtract() {
        assertEquals(2, Demo.subtract(4, 1));
    }
}