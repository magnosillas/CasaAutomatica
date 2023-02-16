package Casa;

import Casa.Controllers.Controllers;

public class Main {
    public static void main(String[] args) {

        Adress local = new Adress("praca", "boa vista","1048","04");



        Controllers ventilador = new Controllers();
        ventilador.turnOn();
        Rooms salaDeEstar = new Rooms("Sala de Estar");
        salaDeEstar.addDisp(ventilador);
        System.out.println(salaDeEstar.dispAmount());
        System.out.println(ventilador.isState());
        salaDeEstar.turnAllOff();
        System.out.println(ventilador.isState());

        Storey terreo = new Storey("Térreo");
        terreo.addAmbientes(salaDeEstar);
        terreo.ambNames();
        terreo.turnAllOn();
        System.out.println(ventilador.isState());


        House cafofo = new House();
        cafofo.addPavimento(terreo);
        cafofo.turnAllOff();
        System.out.println(ventilador.isState());



    }
}