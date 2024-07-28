import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

public class ConsumerDemoUsingTraditionalWay {

    public static void main(String[] args) {

        Consumer<String> con = new ConsumerImpl();
        con.accept("Hello Developer");

    }

}
