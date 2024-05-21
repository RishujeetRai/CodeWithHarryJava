class rectangle3{
    int length;
    int breadth;
    public void setLength(int len) {
        length = len;
    }
    public void setBreadth(int bre) {
        breadth = bre;
    }
    public int getArea(){
        return length*breadth;
    }
}
class cuboid extends rectangle3{
    int height;
    public void setHeight(int h){
        height = h;
    }
    public int getArea(){
        return 2*((length*breadth) + (length*height) + (breadth*height));
    }
    public int getVolume(){
        return length*breadth*height;
    }
}
public class _93_cuboid_inherits_rectangle {
    public static void main(String[] args) {
        rectangle3 R = new rectangle3();
        R.setLength(4);
        R.setBreadth(5);
        System.out.println("The area of the rectangle is: "+R.getArea());
        cuboid C = new cuboid();
        C.setLength(4);
        C.setBreadth(5);
        C.setHeight(6);
        System.out.println("The total surface area of the cuboid is: "+C.getArea());
        System.out.println("The volume of the cuboid is: "+C.getVolume());
    }
}