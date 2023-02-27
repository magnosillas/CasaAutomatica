package Casa.Controllers;

import Casa.Devices;

public class Controllers extends Devices {
    private String name;
    private boolean state;


    public Controllers() {
        turnOff();

    }

    public void turnOn(){
        this.state = true;
    }

    public void turnOff(){
        this.state = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }


    public void getState(){
        System.out.println("Dispositivo: " + getName() + "\t ID: " + getId() + "\t State: " + isState());
    }








}
