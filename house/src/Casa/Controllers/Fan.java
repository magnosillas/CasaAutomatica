package Casa.Controllers;

public class Fan extends Controllers {
    private int mode;

    public Fan(String name) {
        setName(name);
        this.mode = 0;
    }

    public void changeMode(int num){
        turnOn();
        if (num == 1){
            this.mode = num;
        } else if(num == 2){
            this.mode = num;
        } else if(num == 3){
            this.mode = num;
        }
    }

    public void getState(){
        System.out.println("Dispositivo: " + getName() + "\t ID: " + getId() + "\t State: " + isState() + "\t Mode: " + getMode());
    }

    public void turnOff(){
        super.turnOff();
        this.mode = 0;
    }
    public void turnOn(){
        super.turnOn();
        this.mode = 1;
    }


    public int getMode() {
        return mode;
    }
}
