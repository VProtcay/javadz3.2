public class BmiService {
    public double calculate(double bmi) {
        double weight = 100;
        double height = 1.9;
        double index = weight / ( height * height );
        return index;

    }

}
