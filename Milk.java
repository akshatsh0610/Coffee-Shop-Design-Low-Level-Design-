public class Milk extends BeverageDecorator
{
    private static final int milkAddonPrice = 60;
    Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public double getPrice()
    {
      return this.beverage.getPrice() + milkAddonPrice;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " " + "extra milk";
    }
}
