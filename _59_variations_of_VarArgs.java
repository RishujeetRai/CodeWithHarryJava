public class _59_variations_of_VarArgs {
    static int sum1(int ...arr){     // works for any no. of parameters as well as no parameters
        int result = 0;
        for(int element : arr){
            result = result + element;
        }
        return result;
    }
    // we can pass more parameters along with VarArgs,
    // or overload a method having VarArgs,
    // as long as VarArgs stay the last parameters in the list of parameters passed
    static int sum2(int x, int ...arr){
        // works for any no. of integer parameters, but requires at least one integer parameter always
        int result = x;
        for(int element : arr){
            result = result + element;
        }
        return result;
    }
    static int sum3(char c, int ...arr){
        // works for any no. of integer parameters, but requires at least one char parameter always
        int result = 0;
        for(int element : arr){
            result = result + element;
        }
        System.out.println("Char "+c+" also passed along with VarArgs.");
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum1 of no value is: "+sum1());
        // legal, because sum1 doesn't require at least one parameter to be passed

//        System.out.println("The sum2 of no value is: "+sum2());
//        illegal, because sum2 requires at least one integer parameter to be passed
        System.out.println("The sum2 of 1 is: "+sum2(1));
        System.out.println("The sum2 of 1 and 2 is: "+sum2(1,2));
        System.out.println("The sum2 of 1, 2 and 3 is: "+sum2(1,2,3));
        System.out.println("The sum2 of 1, 2 3, 4, 5, 6, 7 and 8 is: "+sum2(1,2,3,4,5,6,7,8));

//        System.out.println("The sum3 of no value is: "+sum3());
//        illegal, because sum3 requires at least one char parameter to be passed
        System.out.println("The sum3 of 1 is: "+sum3('a',1));
        System.out.println("The sum3 of 1 and 2 is: "+sum3('b',1,2));
        System.out.println("The sum3 of 1, 2 and 3 is: "+sum3('c',1,2,3));
        System.out.println("The sum3 of 1, 2 3, 4, 5, 6, 7 and 8 is: "+sum3('d',1,2,3,4,5,6,7,8));
    }
}
