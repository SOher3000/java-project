public class Rectangulator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Rectangulator <length> <width>");
            return;
        }
        try {
            int length = Integer.parseInt(args[0]);
            int width = Integer.parseInt(args[1]);

            if (length <= 0 || width <= 0) {
                System.out.println("Length and width must be positive integers.");
                return;
            }

            Rectangle myRectangle = new Rectangle(length, width);

            String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n",
                    myRectangle.getLength(), myRectangle.getWidth(), myRectangle.getArea(), myRectangle.getPerimeter());

            System.out.println(output);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer values for length and width.");
        }
    }
}
