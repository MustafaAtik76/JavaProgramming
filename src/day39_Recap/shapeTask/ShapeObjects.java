package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10.0);
        System.out.println(square);

        System.out.println(square.getName());
        System.out.println(square.getSide());

        square.setSide(05);
        System.out.println(square);
        System.out.println("----------------------");

        Rectangle rectangle = new Rectangle(5.5, 4.5);
        System.out.println(rectangle.getName());
        System.out.println(rectangle);

        rectangle.setWidth(10);
        rectangle.setLength(12);
        System.out.println(rectangle);
        System.out.println("------------------------------");

        Circle circle= new Circle(5.5);
        System.out.println(circle.getName());
        System.out.println(circle.getRadius());

        System.out.println(circle);

        circle.setRadius(10);
        System.out.println(circle);
    }
}
