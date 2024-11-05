import java.util.Scanner;
import java.util.logging.Logger;

class Dec2Hex {
    public static int arg1; // Renamed from Arg1 to arg1 for consistency
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName()); // Added logger

    public static void main(String args[]) {
        try {
            // Check if an argument is provided
            if (args.length == 0) {
                logger.warning("No input provided. Please enter an integer.");
                return;
            }

            // Attempt to parse the input as an integer
            arg1 = Integer.parseInt(args[0]);

            // Array for hexadecimal representation
            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num = arg1;
            String hexadecimal = "";

            logger.info("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            logger.info("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            logger.severe("Invalid input. Please enter a valid integer.");
        }
    }
}
