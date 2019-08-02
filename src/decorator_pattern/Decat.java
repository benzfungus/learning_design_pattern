package decorator_pattern;

public class Decat extends Beverage {

    public Decat() {
        description = "Decat Coffee";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }

}
