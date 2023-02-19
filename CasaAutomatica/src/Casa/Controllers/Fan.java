package Casa.Controllers;

public class Fan extends Controllers {
    private int mode;

    public Fan(String name) {
        setName(name);
        changeMode(1);
    }

    public void changeMode(int num){
        if (num == 1){
            this.mode = num;
        } else if(num == 2){
            this.mode = num;
        } else if(num == 3){
            this.mode = num;
        }
    }

    public int getMode() {
        return mode;
    }
}
