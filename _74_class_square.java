class square{
    int side;
    public void setSide(int a){
        side = a;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}
public class _74_class_square {
    public static void main(String[] args) {
        square s = new square();
        s.setSide(3);
        System.out.println("The area is: "+s.getArea());
        System.out.println("The perimeter is: "+s.getPerimeter());
    }
}
