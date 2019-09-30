
public class SwimmingPool {

    private double maxVolume;
    private double currentVolume;

    public SwimmingPool() {
        maxVolume = 1000;
        currentVolume = 400;
    }

    public SwimmingPool(double mVol, double cVol) {
        maxVolume = mVol;
        currentVolume = cVol;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume(double setMax)
    {
        maxVolume = setMax;
    }
    
    public void setCurrentVolume(double setCurrent)
    {
        currentVolume = setCurrent;
    }
    public void increaseVolume(double incVolume) {
        currentVolume += incVolume;
    }

    public void decreaseVolume(double decVolume) {
        currentVolume -= decVolume;
    }

    public String toString() {
        return "Max Volume: " + maxVolume + " gallons\n" + "Current Volume: " + currentVolume + " gallons";
    }
}
