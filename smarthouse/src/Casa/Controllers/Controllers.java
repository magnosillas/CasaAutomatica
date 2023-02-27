package Casa.Controllers;

import Casa.Devices;

public class Controllers extends Devices {
    private String name;
    private boolean state;
    private int id;
    private static int controllerID = 1;

    public Controllers() {
        turnOff();
        this.id = controllerID++;
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


    public int getId() {
        return id;
    }






}
