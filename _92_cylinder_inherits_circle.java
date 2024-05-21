class circle2{
    int radius;
    public void setRadius(int r){
        radius = r;
    }
    public float area(){
        return 3.14159265358979323846264338f*radius*radius;
    }
}
class cylinder2 extends circle2{
    int height;
    public void setHeight(int h){
        height = h;
    }
    public float area(){
        return (2*3.14159265358979323846264338f*radius*radius)+(2*3.14159265358979323846264338f*radius*height);
    }
    public float volume(){
        return 3.14159265358979323846264338f*radius*radius*height;
    }
}
public class _92_cylinder_inherits_circle {
    public static void main(String[] args) {
        circle2 c = new circle2();
        c.setRadius(4);
        System.out.println("The area of the circle is: "+c.area());
        cylinder2 cy = new cylinder2();
        cy.setRadius(5);
        cy.setHeight(6);
        System.out.println("The total surface area of the cylinder is: "+cy.area());
        System.out.println("The total volume of the cylinder is: "+cy.volume());
    }
}
