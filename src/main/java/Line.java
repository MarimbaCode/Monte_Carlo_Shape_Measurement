public class Line extends Shape{

    private double m, b;
    public Line(double m, double b){
        this.m = m;
        this.b = b;
    }

    @Override
    public boolean pointInShape(double x, double y) {
        return  y <= (x * m) + b;
    }
}
