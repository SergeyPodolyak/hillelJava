package Pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 0+super.cost();
    }

    @Override
    public String description() {
        return "dfbnd "+super.description();
    }


}
