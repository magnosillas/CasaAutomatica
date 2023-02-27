package Casa;

public abstract class Devices {

    private int id;
    private static int dispID = 1;

    public Devices(){
        this.id = dispID++;
    }

    public int getId() {
        return id;
    }
}
