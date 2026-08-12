 class Area {
    void area(int a,int b) {
        System.out.println("Area of rectangle: "+(a*b));
    }
    void area(int a) {
        System.out.println("Area of square: "+(a*a));
    }
    void area(double r) {
        System.out.println("Area of circle: "+(3.14*r*r));
    }
    void area(double a,double b) {
        System.out.println("Area of triangle: "+(0.5*a*b));
    }
}
class use{
    public static void main(String args []){
        Area a=new Area();
        a.area(5,10);
        a.area(3.0,5.0);
        a.area(4);
        a.area(2.5);
    }
}
