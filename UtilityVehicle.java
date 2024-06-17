public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Utility Vehicle - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage + " miles, Four-Wheel Drive: " + (fourWheelDrive ? "Yes" : "No");
    }

    // Getter for fourWheelDrive
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
}
