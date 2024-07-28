//Note: We implement lambda expression to Runnable because it is a functional Interface


public class RunnableIntefaceUsingLambdaExpression {

    public static void main(String[] args) {

        //Note: Here we have to create object for Thread, because we have to call the Thread methods i.e., start()
        //Note: We can assign(=) lambda expression to a functional interface variable
        Thread threadLambda = new Thread(() -> {
            System.out.println("run() method called using lambda...");
        });

        //We can write the above object creation as follows...
        //Thread threadLambda = new Thread(() -> System.out.println("run() method called using lambda..."));

        threadLambda.start();

    }

}
