package Casa;

import java.util.ArrayList;
import java.util.List;

public class Storey {
    private String name;
    private List<Rooms> rooms;

    public Storey(String name) {
        rooms = new ArrayList<>();
        setName(name);
    }

    public int dispositivoAmount(){
        int soma = 0;

        for (Rooms amb : getRooms()){
            soma += amb.dispAmount();
        }
        return soma;
    }

    public void turnAllOff(){
        for (Rooms amb : getRooms()){
            amb.turnAllOff();
        }
    }
    public void turnAllOn(){
        for (Rooms amb : getRooms()){
            amb.turnAllOn();
        }
    }

    public void addRooms(Rooms amb){
        getRooms().add(amb);
    }

    public void roomNames(){
        for (Rooms amb : getRooms()){
            System.out.println(amb.getName());
        }
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
