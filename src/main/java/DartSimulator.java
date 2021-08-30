import java.text.DecimalFormat;
import java.util.Random;

public class DartSimulator {

    private Shape shape;
    private double boundX, boundY;
    private Random random;



    public DartSimulator(Shape shape, double boundX, double boundY){

        this.shape = shape;
        this.boundX = boundX;
        this.boundY = boundY;
        random = new Random();

    }

    public DartSimulator(Shape shape, double boundX, double boundY,  long seed){

        this.shape = shape;
        this.boundX = boundX;
        this.boundY = boundY;
        random = new Random(seed);

    }

    public double[] simulate(int trials){
        //{trials, hits, misses}
        double[] toReturn = new double[3];
        double[] point;

        for (int i = 0; i < trials; i++) {

            point = getPoint();
            if(shape.pointInShape(point[0], point[1])){
                toReturn[1]++;
            }else{
                toReturn[2]++;
            }

        }
        toReturn[0] = trials;
        return toReturn;
    }

    public double[] getPoint(){
        return new double[]{random.nextDouble() * boundX, random.nextDouble() * boundY};
    }


}
