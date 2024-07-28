
class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method is called.....");
    }
}

public class RunnableInterfaceTraditionalWay {

    public static void main(String[] args) {

        //Here we are creating the object for Thread
        //In that we are passing object of ThreadDemo
        //Because we have to call the start() method of Runnable class
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

    }

}
