package Casa.Sensors;

public class Sensor {
    private String name;
    private double value;
    private int id;
    private static  int sensorId;


    public Sensor(){
        this.id = sensorId++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
