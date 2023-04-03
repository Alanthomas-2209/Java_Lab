package java_lab.CO4.Graphics;
import java.lang.Math.*;
interface Area  {
    double Rectangle (float length, float breadth);
    double Triangle (float base, float height);
    double Circle (float radius);
    double Square (float side);

}
public class Calculations implements Area {
    public double Rectangle (float length, float breadth) {
        return length * breadth;
    }
    public double Triangle (float base, float height) {
        return .5 * base * height;
    }
    public  double Circle(float radius) {
        return radius * radius * Math.PI;
    }
    public double Square (float side) {
        return side * side;
    }
}
