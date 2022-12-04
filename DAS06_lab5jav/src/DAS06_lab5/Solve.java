package DAS06_lab5;

import java.io.Serializable;
import static java.lang.Math.pow;

public class Solve implements Serializable {
    private static final long serialVersionUID = 1L;

    private double x;
    private double a;
    private double b;
    private double y;

    public Solve(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        if (x > 6) {
                    y = (6*x*x-a*b)/(2*x*x);
                } else {
                    y = 4*(x+a*a+b*b);
        }
    }

    public double getX() {
        return x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getY() {
        return y;
    }
    
    

    @Override
    public String toString() {
        return String.format("Ответ = " + y);
    }

}
