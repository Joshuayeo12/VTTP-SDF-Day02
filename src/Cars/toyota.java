package Cars;

public class Toyota extends Car {


private boolean gps = false;

    public Toyota() {
        setMake("Toyota");

    }

    //Overriding
    //Method signiture is the same as the parents
    @Override
    public void go (int d, int t){
this.fuel -=d

    }

    public boolean isGps() {
        return gps;}
    public void setGps(boolean gps) {
        this.gps = gps;
    }

    
    
}
