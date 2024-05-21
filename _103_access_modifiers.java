class super1{
    public int a = 5;
    protected int b = 6;
    int c = 7;      // default or no modifier
    private int d = 8;
}
class sub1 extends super1{      // subclass of super1
    // Trying to print values with different access modifiers in the subclass
    public void method(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);    // not allowed: subclass doesn't have access to superclass' private variables
    }
}
public class _103_access_modifiers {
    public static void main(String[] args) {
        // Trying to print values with different access modifiers in the same package
        super1 S1 = new super1();
        System.out.println(S1.a);
        System.out.println(S1.b);
        System.out.println(S1.c);
//        System.out.println(S1.d);     // not allowed: package doesn't have access to private class variables
    }
}

/*
    Modifier                           Class            Package            Subclass            World

     public                             YES              YES                 YES                YES
     private                            YES              YES                 YES                 NO
     no modifier (default)              YES              YES                  NO                 NO
     protected                          YES               NO                  NO                 NO
*/