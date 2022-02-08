package Exmple1;

public class ShopTest {
    public static void main(String[] args) {
        Part part1 = new Part(9992,"Michelin","SuperWinter",120);
        Tire tire = new Tire(1200, "Koning", "Spring201",
                201, 18, 20);
        System.out.println("informacje o oponie:" + tire.getModelName() + tire.getProducerName() + tire.getPartNumber());
    }
}
