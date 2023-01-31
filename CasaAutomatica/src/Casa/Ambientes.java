package Casa;

import java.util.ArrayList;
import java.util.List;

public class Ambientes {
    private List<Dispositivo> dispositivos;
    private String name;


    public Ambientes(String name) {
        dispositivos= new ArrayList<>();

        setName(name);
    }

    public void turnAllOff(){
        for (Dispositivo dis : getDispositivos()){
            dis.turnOff();
        }
    }

    public void turnAllOn(){
        for (Dispositivo dis : getDispositivos()){
            dis.turnOn();
        }
    }

    public int dispAmount(){
        return getDispositivos().size();
    }

    public void addDisp(Dispositivo disp){
        this.dispositivos.add(disp);
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
