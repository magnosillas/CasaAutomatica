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

    public void storeyNames(){
        for (Storey pav: storeys){
            System.out.println(pav.getName());
        }
    }
    public void getStates(){

        for( Storey storey: storeys){
            storey.getStates();
        }

    }

    public void addStorey(Storey pav){
        storeys.add(pav);
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
