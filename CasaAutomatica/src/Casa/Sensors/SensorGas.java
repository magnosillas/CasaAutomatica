package Casa.Sensors;

public class SensorGas extends Sensor{
    private double maximumLimit;

    public SensorGas(String name, double maximumLimit){
        setName(name);
        setValue(20.5f);
        this.maximumLimit = maximumLimit;
    }

    public void checkLimit(){
        if (getValue() > maximumLimit) {
            System.out.println("WARNING: Gas concentration exceeds the maximum limit!");

        }
    }

    public double getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(double maximumLimit) {
        this.maximumLimit = maximumLimit;
    }
}
