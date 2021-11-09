package shapes;

class Square extends Shape {
    private double sideLength;

    Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 4 * sideLength;
    }
}
