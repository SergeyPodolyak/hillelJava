package Pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Krema extends BeverageDecorator {
    public Krema(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 10+ super.cost();
    }

    @Override
    public String description() {
        return "sdvsv"+super.description();
    }
}
