class rectangle{
    int length;
    int breadth;
    public void setSides(int a, int b){
        length = a;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}
public class _75_class_rectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setSides(3,4);
        System.out.println("The area is: "+r.getArea());
        System.out.println("The perimeter is: "+r.getPerimeter());
    }
}
