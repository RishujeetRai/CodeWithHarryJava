class circle{
    int radius;
    public void setRadius(int r){
        radius = r;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getPerimeter(){
        return 2*3.14f*radius;
    }
}
public class _77_class_circle {
    public static void main(String[] args) {
        circle c = new circle();
        c.setRadius(3);
        System.out.println("The area is: "+c.getArea());
        System.out.println("The perimeter is: "+c.getPerimeter());
    }
}
