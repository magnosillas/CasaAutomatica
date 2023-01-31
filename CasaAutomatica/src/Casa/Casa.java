package Casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Pavimento> pavimentos;
    private String usuario;

    public Casa(String usuario) {
        pavimentos = new ArrayList<>();
        this.usuario = usuario;
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

    public void pavNames(){
        for (Pavimento pav: pavimentos){
            System.out.println(pav.getName());
        }
    }

    public void addPavimento(Pavimento pav){
        pavimentos.add(pav);
    }
}
