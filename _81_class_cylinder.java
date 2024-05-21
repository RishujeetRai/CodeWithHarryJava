class cylinder{
    int radius;
    int height;
//    public void setRadius(int r){       // setter for radius
//        radius = r;
//    }
//    public void setHeight(int h){       // setter for height
//        height = h;
//    }

    public int getRadius() {            // getter for radius
        return radius;
    }
    public int getHeight() {            // getter for height
        return height;
    }

    public cylinder(int r, int h){      // parametrized constructor to set radius and height
        radius = r;
        height = h;
    }
    public float getTSA(){              // method to get the total surface area of the cylinder
        return (2*3.14159265358979323846264338f*radius*height)+(2*3.14159265358979323846264338f*radius*radius);
    }
    public float getVolume(){           // method to get the volume of the cylinder
        return (3.14159265358979323846264338f*radius*radius*height);
    }
}

public class _81_class_cylinder {
    public static void main(String[] args) {
        cylinder c = new cylinder(5,6);    // setting radius=5 and height=6 through parametrized constructor
        System.out.println("The total surface area of the cylinder is: "+c.getTSA());
        System.out.println("The total volume of the cylinder is: "+c.getVolume());

    }
}
