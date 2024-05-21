class rectangle2{
    int length;
    int breadth;
    public rectangle2(){        // default constructor
        length = 4;
        breadth = 5;
    }
    public rectangle2(int len, int bre){    // parametrized constructor
        length = len;
        breadth = bre;
    }
    public int area(){
        return length*breadth;
    }
}
public class _82_constructor_overloading {
    public static void main(String[] args) {
        rectangle2 R1 = new rectangle2();       // through default constructor, length=4 and breadth=5
        System.out.println("The area of rectangle R1 is: "+R1.area());

        rectangle2 R2 = new rectangle2(5,6);    // through parametrized constructor, length=5 and breadth=6
        System.out.println("The area of rectangle R2 is: "+R2.area());
    }
}
