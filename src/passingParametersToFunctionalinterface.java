interface Bike3{
    void details();
}

public class passingParametersToFunctionalinterface {

    public static void main(String[] args) {

        Bike3 hero = () -> System.out.println("Availabe bikes: Splendor, CBZ, PassionPro, Passion Plus");
        print(hero);

    }

    //defining a method to pass parameters
    private static void print(Bike3 bike3){
        bike3.details();
    }

}
