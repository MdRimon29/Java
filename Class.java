class Box{

    double length;
    double breadth;
    double height;
    
    void initData(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    double calculateArea() {
        return length * breadth;
    }

    double calculateVolume() {
        return length * breadth * height;
    }
}
public class Class {
    public static void main(String args[])
    {
        Box obj1, obj2, obj3;
        obj1 = new Box();
        obj2 = new Box();
        obj3 = new Box();
        obj1.initData(42.5, 30.8, 19.2);
        System.out.println( "Area of Box-1 =  " + obj1.calculateArea());
        System.out.println ("Volume of Box-1 =  " + obj1.calculateVolume());
        obj2.initData(23.2, 19.3, 11.2);
        System.out.println( "Area of Box-2 =  " + obj2.calculateArea());
        System.out.println ("Volume of Box-2 =  " + obj2.calculateVolume());
        obj3.initData(55.6, 40.9, 25.8);
        System.out.println( "Area of Box-3 =  " + obj3.calculateArea());
        System.out.println ("Volume of Box-3 =  " + obj3.calculateVolume());
    }
}