package Casa;

import Casa.Controllers.Controllers;
import Casa.Sensors.Sensor;

import java.util.ArrayList;
import java.util.List;

public class Rooms {
    private List<Devices> devices;
    private String name;


    public Rooms(String name) {
        devices = new ArrayList<>();

        setName(name);
    }

    public void turnAllOff(){
        for (Devices dis : getDevices()){
            if(dis instanceof Controllers){
                Controllers cont = (Controllers) dis;
                cont.turnOff();
            }
        }
    }

    public void getStates(){
        System.out.println(getName()+":");
        for (Devices dis : getDevices()){
            if(dis instanceof Controllers){
                Controllers cont = (Controllers) dis;
                cont.getState();
            }
            if(dis instanceof Sensor){
                Sensor sensor = (Sensor) dis;
                sensor.getState();
            }
        }
        System.out.println();
    }

    public void turnAllOn(){
        for (Devices dis : getDevices()){
            if(dis instanceof Controllers){
                Controllers cont = (Controllers) dis;
                cont.turnOn();
            }
        }
    }

    public int dispAmount(){
        return getDevices().size();
    }

    public void addDisp(Devices disp){
        this.devices.add(disp);
    }

    public List<Devices> getDevices() {
        return devices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
