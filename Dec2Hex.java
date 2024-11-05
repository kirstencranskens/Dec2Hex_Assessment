import java.util.logging.Logger;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args) {
        int num;

        try {
            if (args.length == 0) {
                logger.warning("No input provided. Please enter an integer.");
                return;
            }

            num = Integer.parseInt(args[0]);

            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem;
            StringBuilder hexadecimal = new StringBuilder();

            // Conditional logger.info() for performance
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Converting the Decimal Value %d to Hex...", num));
            }

            while (num != 0) {
                rem = num % 16;
                hexadecimal.insert(0, ch[rem]);
                num = num / 16;
            }

            // Conditional logger.info() for performance
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Hexadecimal representation is: %s", hexadecimal.toString()));
            }
        } catch (NumberFormatException e) {
            logger.severe("Invalid input. Please enter a valid integer.");
        }
    }
}
