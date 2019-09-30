
public class SwimmingPoolTester {

    public static void main(String[] args) {
        new SwimmingPoolTester();
    }

    public SwimmingPoolTester() {
        //original max and currentVolume
        System.out.println("This is the original maximum and current volume of the pool:");
        SwimmingPool pool = new SwimmingPool();
        System.out.println(pool);
        System.out.println();

        //adding 300 to currentVolume
        System.out.println("This is the volume after adding 300 gallons:");
        pool.increaseVolume(300);
        System.out.println(pool);
        System.out.println();

        //subtracting 400 from new currentVolume
        System.out.println("This is the volume after subtracting 400 gallons and setting a new maximum volume of 1500 gallons:");
        pool.setMaxVolume(1500);
        pool.decreaseVolume(400);
        System.out.println(pool);
        System.out.println();
    }

}
