package Casa;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Storey> storeys;
    private Adress adress;



    public House() {
        storeys = new ArrayList<>();
    }

    public void turnAllOn(){
        for (Storey pav: storeys){
            pav.turnAllOn();
        }
    }

    public void turnAllOff(){
        for (Storey pav: storeys){
            pav.turnAllOff();
        }
    }

    public void pavimentoNames(){
        for (Storey pav: storeys){
            System.out.println(pav.getName());
        }
    }

    public void addPavimento(Storey pav){
        storeys.add(pav);
    }
}
