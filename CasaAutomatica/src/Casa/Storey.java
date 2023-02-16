package Casa;

import java.util.ArrayList;
import java.util.List;

public class Storey {
    private String name;
    private List<Rooms> ambientes;

    public Storey(String name) {
        ambientes = new ArrayList<>();
        setName(name);
    }

    public int dispositivoAmount(){
        int soma = 0;

        for (Rooms amb : getAmbientes()){
            soma += amb.dispAmount();
        }
        return soma;
    }

    public void turnAllOff(){
        for (Rooms amb : getAmbientes()){
            amb.turnAllOff();
        }
    }
    public void turnAllOn(){
        for (Rooms amb : getAmbientes()){
            amb.turnAllOn();
        }
    }

    public void addAmbientes(Rooms amb){
        getAmbientes().add(amb);
    }

    public void ambNames(){
        for (Rooms amb : getAmbientes()){
            System.out.println(amb.getName());
        }
    }

    public List<Rooms> getAmbientes() {
        return ambientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
