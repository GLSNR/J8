
//We are marking the interface as Functional Interface using @FunctionalInteface annotation
//So, It contains only one abstract method. If we try to add more than one abstract method it will throws the error
@FunctionalInterface
public interface FunctionalInterfaceExampleDemo {

    void print(String msg);

    default void m1(){
        System.out.println("default method1");
    }

    default void m2(){
        System.out.println("default method2");
    }

    static void m3(){
        System.out.println("static method3");
    }

    static void m4(){
        System.out.println("static method4");
    }

}

//As per the defination:
//An Interface that contains exactly one abstract method is known as functional interface.
//It can have any number of default & static methods but can contain only one abstract method.


