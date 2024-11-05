import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Dec2HexTest {

    @Test
    void testValidConversion() {
        assertEquals("F", Dec2Hex.convertToHex(15));  // Assuming convertToHex is the method for conversion
    }

    @Test
    void testNoInput() {
        assertThrows(IllegalArgumentException.class, () -> Dec2Hex.main(new String[]{}));
    }

    @Test
    void testInvalidInput() {
        assertThrows(NumberFormatException.class, () -> Dec2Hex.main(new String[]{"abc"}));
    }
}

