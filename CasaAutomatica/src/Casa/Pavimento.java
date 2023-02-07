package Casa;

import java.util.ArrayList;
import java.util.List;

public class Pavimento {
    private String name;
    private List<Ambientes> ambientes;

    public Pavimento(String name) {
        ambientes = new ArrayList<>();
        setName(name);
    }

    public int dispositivoAmount(){
        int soma = 0;

        for (Ambientes amb : getAmbientes()){
            soma += amb.dispAmount();
        }
        return soma;
    }

    public void turnAllOff(){
        for (Ambientes amb : getAmbientes()){
            amb.turnAllOff();
        }
    }
    public void turnAllOn(){
        for (Ambientes amb : getAmbientes()){
            amb.turnAllOn();
        }
    }

    public void addAmbientes(Ambientes amb){
        getAmbientes().add(amb);
    }

    public void ambNames(){
        for (Ambientes amb : getAmbientes()){
            System.out.println(amb.getName());
        }
    }

    public List<Ambientes> getAmbientes() {
        return ambientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
