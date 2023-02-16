package Casa.Controllers;

public class ArCondicionado extends Controllers {
    private int temperatura;



    public ArCondicionado() {
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

    private void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


}
