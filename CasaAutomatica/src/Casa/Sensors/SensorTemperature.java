package Casa.Sensors;

public class SensorTemperature extends Sensor{

    private double maximumLimit;
    private double minimumLimit;

    public SensorTemperature(String name, double minimumLimit, double maximumLimit ){
        setName(name);
        setValue(20.5f);
        setMinimumLimit(minimumLimit);
        setMaximumLimit(maximumLimit);
    }

    public void checkLimits() {
        if (getValue() > maximumLimit) {
            System.out.println("WARNING: Temperature exceeds the maximum limit!");
        } else if (getValue() < minimumLimit) {
            System.out.println("WARNING: Temperature is below the minimum limit!");
        }
    }


    public double getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(double maximumLimit) {
        this.maximumLimit = maximumLimit;
    }

    public double getMinimumLimit() {
        return minimumLimit;
    }

    public void setMinimumLimit(double minimumLimit) {
        this.minimumLimit = minimumLimit;
    }
}
