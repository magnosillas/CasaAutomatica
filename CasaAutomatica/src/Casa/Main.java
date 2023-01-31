package Casa;

import Casa.Casa;
import Casa.Dispositivo;
import Casa.Pavimento;

public class Main {
    public static void main(String[] args) {

        Dispositivo ventilador = new Dispositivo(001);
        ventilador.turnOn();
        Ambientes salaDeEstar = new Ambientes("Sala de Estar");
        salaDeEstar.addDisp(ventilador);
        System.out.println(salaDeEstar.dispAmount());
        System.out.println(ventilador.isOn());
        salaDeEstar.turnAllOff();
        System.out.println(ventilador.isOn());

        Pavimento terreo = new Pavimento("Térreo");
        terreo.addAmbientes(salaDeEstar);
        terreo.ambNames();
        terreo.turnAllOn();
        System.out.println(ventilador.isOn());

        Casa cafofo = new Casa("Mágno");
        cafofo.addPavimento(terreo);
        cafofo.turnAllOff();
        System.out.println(ventilador.isOn());



    }
}