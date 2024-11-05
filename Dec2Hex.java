import java.util.logging.Logger;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName()); // Logger for output

    public static void main(String[] args) {
        int num;

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
            StringBuilder hexadecimal = new StringBuilder();

            logger.info(String.format("Converting the Decimal Value %d to Hex...", num));

            while (num != 0) {
                rem = num % 16;
                hexadecimal.insert(0, ch[rem]);
                num = num / 16;
            }

            if (hexadecimal.length() > 0) {
                logger.info(String.format("Hexadecimal representation is: %s", hexadecimal.toString()));
            } else {
                logger.warning("No conversion occurred; input was zero or invalid.");
            }
        } catch (NumberFormatException e) {
            logger.severe("Invalid input. Please enter a valid integer.");
        }
    }
}
