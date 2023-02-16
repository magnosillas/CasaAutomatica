package Casa;

import Casa.Controllers.Controllers;

import java.util.ArrayList;
import java.util.List;

public class Rooms {
    private List<Devices> dispositivos;
    private String name;


    public Rooms(String name) {
        dispositivos= new ArrayList<>();

        setName(name);
    }

    public void turnAllOff(){
        for (Devices dis : getDispositivos()){
            if(dis instanceof Controllers){
                Controllers cont = (Controllers) dis;
                cont.turnOff();
            }
        }
    }

    public void turnAllOn(){
        for (Devices dis : getDispositivos()){
            if(dis instanceof Controllers){
                Controllers cont = (Controllers) dis;
                cont.turnOn();
            }
        }
    }

    public int dispAmount(){
        return getDispositivos().size();
    }

    public void addDisp(Devices disp){
        this.dispositivos.add(disp);
    }

    public List<Devices> getDispositivos() {
        return dispositivos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
