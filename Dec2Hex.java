import java.util.logging.Logger;

class Dec2Hex {
    // Logger is used to print info and error messages
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    // Method to convert a decimal number to hexadecimal
    public static String convertToHex(int num) {
        // Check if the number is negative
        if (num < 0) {
            // If it is negative, throw an error
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        // Array to store hexadecimal characters
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder();

        // Special case for 0 since it doesn’t go through the loop
        if (num == 0) {
            return "0";
        }

        // Loop to convert the number to hexadecimal
        while (num != 0) {
            rem = num % 16; // Find the remainder when divided by 16
            hexadecimal.insert(0, ch[rem]); // Insert the corresponding hex character at the start
            num = num / 16; // Update the number by dividing it by 16
        }

        return hexadecimal.toString(); // Return the final hexadecimal value as a string
    }

    public static void main(String[] args) {
        try {
            // Check if the user provided any input
            if (args.length == 0) {
                // If no input, throw an error
                throw new IllegalArgumentException("No input provided. Please enter an integer.");
            }

            // Convert the input to an integer
            int num = Integer.parseInt(args[0]);
            // Log information that conversion is starting
            logger.info(String.format("Converting the Decimal Value %d to Hexadecimal...", num));
            
            // Call the conversion method
            String hexValue = convertToHex(num);
            // Log the result of the conversion
            logger.info(String.format("Hexadecimal representation is: %s", hexValue));
            
        } catch (NumberFormatException e) {
            // If the input is not a valid integer, log an error and throw the exception
            logger.severe("Invalid input. Please enter a valid integer.");
            throw e; // Rethrow to be caught in tests
        } catch (IllegalArgumentException e) {
            // Log the specific error message and rethrow
            logger.severe(e.getMessage());
            throw e; // Rethrow to be caught in tests
        }
    }
}
