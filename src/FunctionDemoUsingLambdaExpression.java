import java.util.function.Function;

public class FunctionDemoUsingLambdaExpression {

    public static void main(String[] args) {

        //Traditional Way of implementing function interface
//        class FunctionalImp implements Function<String, Integer>{
//
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        }

        //Implementation of function interface using lambda expression.
        Function<String, Integer> fun = (String s) -> {
            return s.length();
        };
        int k= fun.apply("Nagaraju");
        System.out.println(k);

        //We can simply the above code 16 to 21 as follows:
        Function<String, Integer> fun2 = (String s1) -> s1.length();
        System.out.println(fun2.apply("Raju"));


    }

}
