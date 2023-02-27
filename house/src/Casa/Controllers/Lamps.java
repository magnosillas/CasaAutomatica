package Casa.Controllers;

public class Lamps extends Controllers {
    private String color;
    private int intensity;

    public Lamps(String name) {
        setName(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color.toLowerCase();
        if(color.equals("azul") || color.equals("vermelho") || color.equals("verde") || color.equals("amarelo")){
            this.color = color;
        }
    }

    public int getIntensidade() {
        return intensity;
    }

    public void setIntensidade(int intensidade) {

        this.intensity = intensidade;
    }

    public void getState(){
        System.out.println("Dispositivo: " + getName() + "\t ID: " + getId() + "\t State: " + isState() + "\t Color: " + getColor() + "\t Intensity: " + getIntensidade());
    }
}
