package $package;

/**
 * Simple
 *
 */
public class App {

    public App() {
    }

    public double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value should be non negative");
        }
        return Math.sqrt(value);
    }
}
