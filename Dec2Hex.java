import java.util.logging.Logger;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static String convertToHex(int num) {
        // Check for negative input and throw an exception
        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder();

        // Special case for 0
        if (num == 0) {
            return "0";
        }

        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }

        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("No input provided. Please enter an integer.");
            }

            int num = Integer.parseInt(args[0]);
            logger.info(String.format("Converting the Decimal Value %d to Hex...", num));
            String hexValue = convertToHex(num);
            logger.info(String.format("Hexadecimal representation is: %s", hexValue));
        } catch (NumberFormatException e) {
            logger.severe("Invalid input. Please enter a valid integer.");
            throw e; // Rethrow to be caught in tests
        } catch (IllegalArgumentException e) {
            logger.severe(e.getMessage());
            throw e; // Rethrow to be caught in tests
        }
    }
}
