package Casa.Controllers;

public class AirConditioner extends Controllers {
    private int temperature;



    public AirConditioner() {
        setTemperature(20);
    }

    public void increaseTemp() {
        if (getTemperature() <= 26) {
            setTemperature(getTemperature() + 1);
        } else {
            System.out.println("Temperatura já está no máximo");
        }
    }

    public void decreaseTemp() {
        if (getTemperature() >= 17) {
            setTemperature(getTemperature() - 1);
        }else{
            System.out.println("Temperatura já está no mínimo");
        }
    }

    public void changeMode(String mode){
        mode = mode.toLowerCase();
        switch (mode) {
            case "hot" -> {
                setTemperature(26);
            }
            case "cool" -> {
                setTemperature(16);
            }
            case "medium" -> setTemperature(20);
        }
    }


    public int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }


}
