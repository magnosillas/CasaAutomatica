package Casa;

import Casa.Controllers.Controllers;
import Casa.Controllers.Fan;
import Casa.Controllers.Lamps;
import Casa.Sensors.SensorGas;

public class Main {
    public static void main(String[] args) {
        User user = new User("uau@gmail.com","uaucara","uau123","Uau");
        House cafofo = new House();
        user.addHouse(cafofo);
        Adress local = new Adress("praca", "boa vista","1048","04");
        cafofo.setAdress(local);

        Storey terreo = new Storey("Térreo");
        cafofo.addStorey(terreo);

        Rooms salaDeEstar = new Rooms("Sala de Estar");
        terreo.addRooms(salaDeEstar);

        Fan ventilador = new Fan("Ventilador sala");
        salaDeEstar.addDisp(ventilador);


        Lamps lampada = new Lamps("Lampada cozinha");
        salaDeEstar.addDisp(lampada);

        SensorGas sensor = new SensorGas("Sensor gas cozinha", 50);
        salaDeEstar.addDisp(sensor);

        System.out.println(salaDeEstar.dispAmount());
        salaDeEstar.getStates();

        ventilador.changeMode(2);

        lampada.setColor("blue");
        lampada.setIntensidade(50);

        sensor.setValue(50.4);
        sensor.checkLimit();
        System.out.println();

        salaDeEstar.getStates();


        salaDeEstar.turnAllOff();
        salaDeEstar.getStates();

        terreo.roomNames();
        System.out.println();
        terreo.turnAllOn();
        terreo.getStates();

        cafofo.turnAllOff();
        cafofo.getStates();


    }
}