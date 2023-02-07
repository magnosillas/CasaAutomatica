package Casa;

public class Main {
    public static void main(String[] args) {

        Dispositivo ventilador = new Dispositivo(001);
        ventilador.turnOn();
        Ambientes salaDeEstar = new Ambientes("Sala de Estar");
        salaDeEstar.addDisp(ventilador);
        System.out.println(salaDeEstar.dispAmount());
        System.out.println(ventilador.isState());
        salaDeEstar.turnAllOff();
        System.out.println(ventilador.isState());

        Pavimento terreo = new Pavimento("Térreo");
        terreo.addAmbientes(salaDeEstar);
        terreo.ambNames();
        terreo.turnAllOn();
        System.out.println(ventilador.isState());


        SmartHouse cafofo = new SmartHouse();
        cafofo.addPavimento(terreo);
        cafofo.turnAllOff();
        System.out.println(ventilador.isState());



    }
}