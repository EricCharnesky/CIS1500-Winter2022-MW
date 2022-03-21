package lab9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void setLength() {
        // Arrange
        int expectedLength = 5;
        Square square = new Square(0);

        // Act
        square.setLength(expectedLength);
        int actualLength = square.getLength();
        int actualWidth = square.getWidth();

        // Assert
        assertEquals(expectedLength, actualLength);
        assertEquals(expectedLength, actualWidth);

    }

    @Test
    void setWidth() {
        // Arrange
        int expectedLength = 5;
        Square square = new Square(0);

        // Act
        square.setWidth(expectedLength);
        int actualLength = square.getLength();
        int actualWidth = square.getWidth();

        // Assert
        assertEquals(expectedLength, actualLength);
        assertEquals(expectedLength, actualWidth);
    }
}