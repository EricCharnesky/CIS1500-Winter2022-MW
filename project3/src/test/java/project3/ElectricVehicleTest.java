package project3;

import static org.junit.jupiter.api.Assertions.*;

class ElectricVehicleTest {

    @org.junit.jupiter.api.Test
    void constructor() {
        // Arrange
        String expectedMake = "make";
        String expectedModel = "model";
        String expectedColor = "color";
        double expectedMaxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 50;
        double expectedKilometersPerKilowattHours = 10;

        // Act - call the code we are testing and get values
        ElectricVehicle electricVehicle = new ElectricVehicle(expectedMake, expectedModel, expectedColor,
                expectedMaxKilowattHoursInBattery, expectedCurrentKilowattHoursInBattery, expectedKilometersPerKilowattHours);
        String actualMake = electricVehicle.getMake();
        String actualModel = electricVehicle.getModel();
        String actualColor = electricVehicle.getColor();
        double actualMaxKilowattHoursInBattery = electricVehicle.getMaxKilowattHoursInBattery();
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();
        double actualKilometersPerKilowattHours = electricVehicle.getKilometersPerKilowattHour();

        // Assert
        assertEquals(expectedMake, actualMake);
        assertEquals(expectedModel, actualModel);
        assertEquals(expectedColor, actualColor);
        assertEquals(expectedMaxKilowattHoursInBattery, actualMaxKilowattHoursInBattery, .000001);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);
        assertEquals(expectedKilometersPerKilowattHours, actualKilometersPerKilowattHours, .000001);
    }

    @org.junit.jupiter.api.Test
    void chargeSuccessful() {
        // Arrange
        double maxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 100;
        ElectricVehicle electricVehicle = new ElectricVehicle("", "", "",
                maxKilowattHoursInBattery, 0, 0);

        // Act
        boolean result = electricVehicle.charge(expectedCurrentKilowattHoursInBattery);
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertTrue(result);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);

    }

    @org.junit.jupiter.api.Test
    void chargeReturnsFalseOnNegativeValue() {
        // Arrange
        double maxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 50;
        ElectricVehicle electricVehicle = new ElectricVehicle("", "", "",
                maxKilowattHoursInBattery, expectedCurrentKilowattHoursInBattery, 0);

        // Act
        boolean result = electricVehicle.charge(-10);
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);

    }

    @org.junit.jupiter.api.Test
    void chargeReturnsFalseOnChargingOverMax() {
        // Arrange
        double maxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 100;
        ElectricVehicle electricVehicle = new ElectricVehicle("", "", "",
                maxKilowattHoursInBattery, 50, 0);

        // Act
        boolean result = electricVehicle.charge(maxKilowattHoursInBattery);
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);

    }

    @org.junit.jupiter.api.Test
    void driveSuccessful() {
        // Arrange
        double maxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 90;
        double kilometersPerKilowattHour = 10;
        ElectricVehicle electricVehicle = new ElectricVehicle("", "", "",
                maxKilowattHoursInBattery, maxKilowattHoursInBattery, kilometersPerKilowattHour);

        // Act
        boolean result = electricVehicle.drive(100);
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertTrue(result);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);


    }

    @org.junit.jupiter.api.Test
    void driveReturnsFalseOnNegativeValue() {
        // Arrange
        double maxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 100;
        double kilometersPerKilowattHour = 10;
        ElectricVehicle electricVehicle = new ElectricVehicle("", "", "",
                maxKilowattHoursInBattery, maxKilowattHoursInBattery, kilometersPerKilowattHour);

        // Act
        boolean result = electricVehicle.drive(-100);
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);


    }

    @org.junit.jupiter.api.Test
    void driveReturnsFalseOnGoingBelow0Charge() {
        // Arrange
        double maxKilowattHoursInBattery = 100;
        double expectedCurrentKilowattHoursInBattery = 0;
        double kilometersPerKilowattHour = 10;
        ElectricVehicle electricVehicle = new ElectricVehicle("", "", "",
                maxKilowattHoursInBattery, maxKilowattHoursInBattery, kilometersPerKilowattHour);

        // Act
        boolean result = electricVehicle.drive(10000);
        double actualCurrentKilowattHoursInBattery = electricVehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .000001);


    }
}