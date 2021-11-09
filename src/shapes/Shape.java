package shapes;


abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }


    abstract double calculateArea();

    abstract double calculatePerimeter();

}
