package lab9;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void constructorAndGets() {
        // Arrange
        int expectedLength = 5;
        int expectedWidth = 10;
        int expectedArea = 50;
        int expectedPerimeter = 30;

        // Act - run the code we are testing, and get the actual values
        Rectangle rectangle = new Rectangle(expectedLength, expectedWidth);
        int actualLength = rectangle.getLength();
        int actualWidth = rectangle.getWidth();
        int actualArea = rectangle.getArea();
        int actualPerimeter = rectangle.getPerimeter();

        // Assert
        assertEquals(expectedLength, actualLength);
        assertEquals(expectedWidth, actualWidth);
        assertEquals(expectedArea, actualArea);
        assertEquals(expectedPerimeter, actualPerimeter);
    }


    @org.junit.jupiter.api.Test
    void setLengthNegativeIsSetTo0() {
        // Arrange
        int expectedLength = 0;
        Rectangle rectangle = new Rectangle(0, 0);

        // Act - run the code we are testing, and get the actual values
        rectangle.setLength(-10);
        int actualLength = rectangle.getLength();

        // Assert
        assertEquals(expectedLength, actualLength);
    }

    @org.junit.jupiter.api.Test
    void setWidthNegativeIsSetTo0() {
        // Arrange
        int expectedWidth = 0;
        Rectangle rectangle = new Rectangle(0, 0);

        // Act - run the code we are testing, and get the actual values
        rectangle.setWidth(-10);
        int actualWidth = rectangle.getWidth();

        // Assert
        assertEquals(expectedWidth, actualWidth);
    }
}