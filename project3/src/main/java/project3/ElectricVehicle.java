package project3;

public class ElectricVehicle {

    private String make;
    private String model;
    private String color;
    private double maxKilowattHoursInBattery;
    private double currentKilowattHoursInBattery;
    private double kilometersPerKilowattHour;

    public ElectricVehicle(String make, String model, String color,
                           double maxKilowattHoursInBattery, double currentKilowattHoursInBattery,
                           double kilometersPerKilowattHour) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.maxKilowattHoursInBattery = maxKilowattHoursInBattery;
        this.currentKilowattHoursInBattery = currentKilowattHoursInBattery;
        this.kilometersPerKilowattHour = kilometersPerKilowattHour;
    }

    public boolean charge(double kilowattHoursToCharge) {
        if (kilowattHoursToCharge < 0) {
            return false;
        }
        currentKilowattHoursInBattery += kilowattHoursToCharge;
        if (currentKilowattHoursInBattery > maxKilowattHoursInBattery) {
            currentKilowattHoursInBattery = maxKilowattHoursInBattery;
            return false;
        }
        return true;
    }

    public boolean drive(double kilometersToDrive) {
        if (kilometersToDrive < 0) {
            return false;
        }
        double kilowattHoursRequired = kilometersToDrive / kilometersPerKilowattHour;
        currentKilowattHoursInBattery -= kilowattHoursRequired;

        if ( currentKilowattHoursInBattery < 0 ){
            currentKilowattHoursInBattery = 0;
            return false;
        }
        return true;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getMaxKilowattHoursInBattery() {
        return maxKilowattHoursInBattery;
    }

    public double getCurrentKilowattHoursInBattery() {
        return currentKilowattHoursInBattery;
    }

    public double getKilometersPerKilowattHour() {
        return kilometersPerKilowattHour;
    }
}
