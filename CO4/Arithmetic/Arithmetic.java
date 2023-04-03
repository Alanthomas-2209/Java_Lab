package java_lab.CO4.Arithmetic;

interface Operations {
    double Add(float a, float b);
    double sub(float a, float b);
    double div(float a, float b);
    double mult(float a, float b);
}
public class Arithmetic {
    public double Add(float a, float b) {
        return a + b;
    }
    public double sub(float a, float b) {
        return a - b;
    }
    public double div(float a, float b) {
        return a / b;
    }
    public double mult(float a, float b) {
        {
            return a * b;
        }
    }
}