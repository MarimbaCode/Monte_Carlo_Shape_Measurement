public class Sine extends Shape{

    //k + a * sin(b(x-h))
    private double k, a, b, h;

    public Sine(double a, double b, double h, double k){
        this.a = a;
        this.b = b;
        this.h = h;
        this.k = k;
    }

    @Override
    public boolean pointInShape(double x, double y) {
        return y <= a*Math.sin(b * (x - h)) + k;
    }
}
