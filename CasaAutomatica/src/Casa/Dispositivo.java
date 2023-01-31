package Casa;

public class Dispositivo {
    private String name;
    private boolean state;
    private int id;

    public Dispositivo( int id) {
        turnOff();
        setId(id);
    }

    public void turnOn(){
        setState(true);
    }

    public void turnOff(){
        setState(false);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
