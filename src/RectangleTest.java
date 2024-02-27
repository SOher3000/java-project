import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RectangleTest {
    Rectangle myRectangle = new Rectangle(5, 6);

    @Test
    public void testGetArea() {
        assertEquals(30, myRectangle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(22, myRectangle.getPerimeter());
    }

    @Test
    public void testLength() {
        assertEquals(5, myRectangle.getLength());
    }

    @Test
    public void testWidth() {
        assertEquals(6, myRectangle.getWidth());
    }

    @Test
    public void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 6));
    }
}
