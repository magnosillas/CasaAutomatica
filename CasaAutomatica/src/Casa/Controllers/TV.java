package Casa.Controllers;

public class TV extends Controllers {
    private float volume;

    public TV(String name){
        setName(name);

    }

    public void mudarVolume(int vol){
        if (vol <= 100 && vol >= 0){
            this.volume = vol;
        }
    }

    public float getVolume() {
        return volume;
    }
}
