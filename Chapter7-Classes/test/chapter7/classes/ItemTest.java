
package chapter7.classes;

import org.junit.Test;
import static org.junit.Assert.*;


public class ItemTest {
    
    public ItemTest() {
    }
    
    // testing all the get* methods along with the constructor
    @Test
    public void testConstructor(){
        // AAA
        
        // Arrange - set up all the values I need to to test with
        String expectedName = "ramen noodles";
        String expectedSku = "123";
        double expectedPrice = .39;
        int expectedQuantity = 10;
        double expectedTotalPrice = 3.9;
        
        // Act - call the code we are testing and get actual values
        Item item = new Item(expectedName, expectedSku, expectedPrice, expectedQuantity);
        String actualName = item.getName();
        String actualSku = item.getSku();
        double actualUnitPrice = item.getUnitPrice();
        int actualQuantity = item.getQuantity();
        double actualTotalPrice = item.getTotalPrice();
        
        // Assert - did we get we get what we expected
        assertEquals(expectedName, actualName);
        assertEquals(expectedSku, actualSku);
        // when comparing doubles, you need a 'delta' how close is close enough
        assertEquals(expectedPrice, actualUnitPrice, .000001);
        assertEquals(expectedQuantity, actualQuantity);
        assertEquals(expectedTotalPrice, actualTotalPrice, .000001);
    }

    @Test
    public void testSetUnitPriceDoesntAllowNegativeValues() {
        // Arrange
        double expectedUnitPrice = 0;
        Item item = new Item("", "", 0, 0);
        
        // Act
        boolean result = item.setUnitPrice(-1.5);
        double actualUnitPrice = item.getUnitPrice();
        
        // Assert
        assertEquals(expectedUnitPrice, actualUnitPrice, .000001);
        assertFalse(result);
        
    }

    @Test
    public void testSetQuantityDoesntAllowNegativeValues() {
        // Arrange
        int expectedQuantity = 0;
        Item item = new Item("", "", 0, 0);
        
        // Act
        item.setQuantity(-1);
        int actualQuantity = item.getQuantity();
        
        // Assert
        assertEquals(expectedQuantity, actualQuantity);
        
    }
    
}
