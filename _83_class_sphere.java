class sphere{
    int radius;
//    public void setRadius(int r){           // setter for radius of the sphere
//        radius = r;
//    }
    public sphere(int r){                   // parametrized constructor to set radius of the sphere
        radius = r;
    }
    public float getTSA(){                  // getter for the total surface area of the sphere
        return 4*3.14f*radius*radius;
    }
    public float getVolume(){               // getter for the volume of the sphere
        return (4f/3)*3.14f*radius*radius*radius;
    }
}
public class _83_class_sphere {
    public static void main(String[] args) {
        sphere s = new sphere(4);       // setting radius of the sphere as 4 through a parametrized constructor
        System.out.println("The total surface area of the sphere is: "+s.getTSA());
        System.out.println("The total volume of the sphere is: "+s.getVolume());
    }
}
