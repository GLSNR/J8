import java.util.function.Function;

//Note: Function take 2 parameters.
//1 for the input of the function. i.e., String for input
// 2 for the result of the function. Integer for result
// Here we are giving the string as input and it returns the length of the stirng.
class FunctionalImp implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


public class FunctionDemoUsingTraditionalWay {

    public static void main(String[] args) {

        //Here we are creating the object using FunctionalImp
        FunctionalImp fI = new FunctionalImp();
        int k = fI.apply("Nagaraju");
        System.out.println(k);

        //Here we are creating the object using Function with is the parent for FuntionalImp
        Function<String, Integer> fn = new FunctionalImp();
        System.out.println(fn.apply("HelloUserHai"));

    }
}