import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Dec2HexTest {

    @Test
    public void testConvertToHex() {
        assertEquals("F", Dec2Hex.convertToHex(15));
        assertEquals("A", Dec2Hex.convertToHex(10));
        assertEquals("1A", Dec2Hex.convertToHex(26));
        assertEquals("0", Dec2Hex.convertToHex(0));
    }

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Dec2Hex.convertToHex(-1);
        });
    }

    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            Dec2Hex.main(new String[]{});
        });
    }

    @Test
    public void testInvalidFormat() {
        assertThrows(NumberFormatException.class, () -> {
            Dec2Hex.main(new String[]{"abc"});
        });
    }
}
