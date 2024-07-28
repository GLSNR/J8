
interface Bike{
    void detatils();
}

class Hero implements Bike{

    @Override
    public void detatils() {
        System.out.println("Availabe bikes: Splendor, CBZ, PassionPro, Passion Plus");
    }
}

class Honda implements Bike{

    @Override
    public void detatils() {

        System.out.println("Availabe bikes: Unicorn, SP125, Activa125");

    }
}

class Bajaj implements Bike{

    @Override
    public void detatils() {

        System.out.println("Availabe bikes: Pulasar125, Platinum, CT100");

    }
}


public class normalInterfaceExample {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.detatils();

        Honda honda = new Honda();
        honda.detatils();

        Bajaj bajaj = new Bajaj();
        bajaj.detatils();

    }

}
