package Shape;



class ShapeTest {
    public static void main(String[] args) {
        Shape shape =  new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("yellow", false);
        System.out.println(shape1);

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle);

    }
}