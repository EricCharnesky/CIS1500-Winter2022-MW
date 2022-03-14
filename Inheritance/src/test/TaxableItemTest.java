package test;

import inheritance.TaxableItem;

import static org.junit.jupiter.api.Assertions.*;

class TaxableItemTest {

    @org.junit.jupiter.api.Test
    void getTotalPrice() {
        // Arrange
        double expectedTotalPrice = 1.06;

        // Act
        TaxableItem tableItem = new TaxableItem("","",1, 1, .06);
        double actualTotalPrice = tableItem.getTotalPrice();

        // Assert
        assertEquals(expectedTotalPrice, actualTotalPrice, .000001);
    }
}