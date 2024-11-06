import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dec2HexTest {

    // Test the convertToHex method with valid decimal inputs
    @Test
    public void testConvertToHex() {
        // Check if 15 converts to "F"
        Assertions.assertEquals("F", Dec2Hex.convertToHex(15));
        // Check if 10 converts to "A"
        Assertions.assertEquals("A", Dec2Hex.convertToHex(10));
        // Check if 26 converts to "1A"
        Assertions.assertEquals("1A", Dec2Hex.convertToHex(26));
        // Check if 0 converts to "0"
        Assertions.assertEquals("0", Dec2Hex.convertToHex(0));
    }

    // Test if the convertToHex method handles negative numbers properly
    @Test
    public void testNegativeNumber() {
        // Passing a negative number should throw an IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dec2Hex.convertToHex(-1);
        });
    }

    // Test if the main method handles no input properly
    @Test
    public void testInvalidInput() {
        // If no input is provided, the main method should throw an IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dec2Hex.main(new String[]{});
        });
    }

    // Test if the main method handles non-integer input properly
    @Test
    public void testInvalidFormat() {
        // If a non-integer (e.g., "abc") is provided, the main method should throw a NumberFormatException
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Dec2Hex.main(new String[]{"abc"});
        });
    }
}
