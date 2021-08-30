public class Rectangle extends Shape{

    private double minX, minY, maxX, maxY;

    public Rectangle(double x1, double y1, double x2, double y2){

        this.minX = x1;
        this.minY = y1;
        this.maxX = x2;
        this.maxY = y2;

    }


    @Override
    public boolean pointInShape(double x, double y) {

        return (minX <= x && maxX >= x && minY <= y && maxY >= y);

    }
}
