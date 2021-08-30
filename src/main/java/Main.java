import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Shape rectangle = new Rectangle(0,0,10,3);
        Shape line = new Line(1, 0);
        Shape sine = new Sine(1, Math.PI, 0.5, 1);


        DartSimulator simulator = new DartSimulator(sine, 10, 10);
        double[] res = simulator.simulate(10000000);

        System.out.println("\r" + Arrays.toString(res));
        System.out.printf("%.3f", (res[1] / res[0]) * 100);
    }

}
