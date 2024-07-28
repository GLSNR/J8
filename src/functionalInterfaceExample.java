interface Bike1{
    void details();
}

public class functionalInterfaceExample {

    public static void main(String[] args) {

        //Normal way of overriding from the interface
        /*
        @Override
         public void detatils() {
        System.out.println("Availabe bikes: Pulasar125, Platinum, CT100");
    }  */

        //functional interface implementation
        //Note: Bike1 is the name of the interface
        Bike1 hero1 = () -> {
            System.out.println("Availabe bikes: Splendor, CBZ, PassionPro, Passion Plus");
        };
        hero1.details();

        //We can also remove the above {} and we can write it as
        // Bike1 hero = () -> System.out.println("Availabe bikes: Splendor, CBZ, PassionPro, Passion Plus");
        // hero1.details();

        Bike1 bajaj = () -> System.out.println(" Available bikes: Pulsar125, Platinum");
        bajaj.details();


    }

}
