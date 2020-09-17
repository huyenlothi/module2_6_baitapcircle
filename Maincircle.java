public class Maincircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(7);
        System.out.println(cylinder);
        cylinder= new Cylinder(6,"red",3);
        System.out.println(cylinder);
    }
}
