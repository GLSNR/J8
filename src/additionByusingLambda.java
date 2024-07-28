interface addition{
    int add(int a, int b);
}

public class additionByusingLambda {

    public static void main(String[] args) {

        //Note: Here addition is the interface name and Add the reference variable we have given.
        //Here java compiler will automatically look the type of parameters form the method parameters.
        //So, it's optional to mention (int a, int b) we can write it as (a,b)
        addition Add = (a, b) -> (a + b); //Model 1, wiriting single lambda statement.

        //We are storing the sum by calling the add method and storing it in result
        int result = Add.add(10, 20);

        //Printing the result
        System.out.println(result);

        //--------------------------------------------------
        //Model 2 using multiple statements in lambda body.-------------------
        addition add2 = (a,b) -> {
            int c= a+b; //statement 1
            return c; //statement 2
        };

        int result2 = add2.add(30,50);
        //Printing the result
        System.out.println(result2);
    }
}