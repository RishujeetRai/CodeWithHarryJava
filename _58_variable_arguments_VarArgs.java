public class _58_variable_arguments_VarArgs {

    // unnecessarily overloaded
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    // Rather, we use variable arguments, or VarArgs
    static int sum(int ...arr){     // we can now pass any number of values to this method
        // Available as int[] arr
        int result = 0;
        for(int element : arr){     // use of for-each loop since we don't know the size of the array
            result = result + element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 4, 5 and 6 is: "+sum(4,5,6));
        System.out.println("The sum of 4, 5, 6 and 7 is: "+sum(4,5,6,7));

        System.out.println("The sum of no value is: "+sum());   // VarArgs work for passing no values as well
        System.out.println("The sum of 1,2,3,4,5,6,7,8,9 and 10 is: "+sum(1,2,3,4,5,6,7,8,9,10));
    }
}