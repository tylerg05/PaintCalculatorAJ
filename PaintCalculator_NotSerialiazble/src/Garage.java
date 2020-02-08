import java.io.Serializable;

public class Garage implements Serializable, Paintable {
    @Override
    public double getPremiumCost() {
        return 2000;
    }

    @Override
    public double getStandardCost() {
        return 800;
    }

    @Override
    public String toString() {
        return "Garage($" + getPremiumCost() + ")";
    }
}
