package Casa;

public class ArCondicionado extends Dispositivo{
    private int temperatura;



    public ArCondicionado(int id) {
        super(id);
        setTemperatura(20);

    }

    public void aumentarTemp() {
        if (getTemperatura() <= 26) {
            setTemperatura(getTemperatura() + 1);
        } else {
            System.out.println("Temperatura já está no máximo");
        }
    }

    public void diminuirTemp() {
        if (getTemperatura() >= 17) {
            setTemperatura(getTemperatura() - 1);
        }else{
            System.out.println("Temperatura já está no mínimo");
        }
    }

    public void mudarModo(String modo){
        modo = modo.toLowerCase();
        switch (modo) {
            case "hot" -> {
                setTemperatura(26);
            }
            case "cool" -> {
                setTemperatura(16);
            }
            case "medium" -> setTemperatura(20);
        }
    }


    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


}
