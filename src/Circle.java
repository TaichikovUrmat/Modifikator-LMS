public class Circle {
    private double pi;
    private int radius;

    public Circle(double pi, int radius) {
        this.pi = pi;
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void circumference(double pi,int radius){
        System.out.println("circumference: "+pi*2*radius);
    }
    public static void area(double pi,int radius){
        System.out.println("area: "+pi*(radius*radius));
    }
}
