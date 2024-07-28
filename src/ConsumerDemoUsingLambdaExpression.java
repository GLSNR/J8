import java.util.function.Consumer;

public class ConsumerDemoUsingLambdaExpression {

    public static void main(String[] args) {

        Consumer<String> consumer = (String input) -> {

            System.out.println(input);
        };
        consumer.accept("This is Nobitha");

        //Simplifying the above....
        Consumer<String> consumer1 = (input2) -> System.out.println(input2);
        consumer1.accept("This is Doremon");

    }

}
