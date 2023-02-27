package Casa.Sensors;

import Casa.Devices;

public class Sensor extends Devices {
    private String name;
    private double value;



    public Sensor(){

    }

    public String getName() {
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void getState(){
        System.out.println("Sensor: " + getName() + "\t ID: " + getId() + "\t Value: " + getValue());
    }
}
