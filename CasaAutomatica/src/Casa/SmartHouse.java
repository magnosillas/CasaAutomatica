package Casa;

import java.util.ArrayList;
import java.util.List;

public class SmartHouse {
    private List<Pavimento> pavimentos;


    public SmartHouse() {
        pavimentos = new ArrayList<>();
    }

    public void turnAllOn(){
        for (Pavimento pav: pavimentos){
            pav.turnAllOn();
        }
    }

    public void turnAllOff(){
        for (Pavimento pav: pavimentos){
            pav.turnAllOff();
        }
    }

    public void pavimentoNames(){
        for (Pavimento pav: pavimentos){
            System.out.println(pav.getName());
        }
    }

    public void addPavimento(Pavimento pav){
        pavimentos.add(pav);
    }
}
