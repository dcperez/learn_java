
public class Product_Tester {

    public static void main(String[] args) {
        new Product_Tester();
    }

    public Product_Tester() {
        
        //first object instance: rubber duck
        Product duck = new Product();
        System.out.println(duck);
        System.out.println();
        
        //second object instance: computer
        Product computer = new Product("Computer", 1000);
        System.out.println(computer);
        System.out.println();
        
        //demonstrate mutator on computer object
        computer.setName("New Computer");
        computer.priceIncrease(1000);
        System.out.println(computer);
    }
}
