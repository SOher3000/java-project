public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}
