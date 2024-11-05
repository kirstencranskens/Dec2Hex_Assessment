import java.util.Scanner;
import java.util.logging.Logger;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName()); // Logger for output
    private static final int ARG1; // Made static and final as recommended by SonarQube

    static {
        ARG1 = 0; // Initializing ARG1 with a default value in a static block
    }

    public static void main(String[] args) {
        int num; // Declared `num` on a separate line as recommended

        try {
            // Check if an argument is provided
            if (args.length == 0) {
                logger.warning("No input provided. Please enter an integer.");
                return;
            }

            // Parse the input as an integer
            num = Integer.parseInt(args[0]);

            // Array for hexadecimal representation
            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem;
            StringBuilder hexadecimal = new StringBuilder(); // Using StringBuilder for better performance

            logger.info(String.format("Converting the Decimal Value %d to Hex...", num));

            while (num != 0) {
                rem = num % 16;
                hexadecimal.insert(0, ch[rem]);
                num = num / 16;
            }

            logger.info(String.format("Hexadecimal representation is: %s", hexadecimal.toString()));
        } catch (NumberFormatException e) {
            logger.severe("Invalid input. Please enter a valid integer.");
        }
    }
}

