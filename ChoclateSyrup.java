public class ChoclateSyrup extends BeverageDecorator
{
    private static final int ChoclateSyrupAddonPrice = 100;
    Beverage beverage;

    public ChoclateSyrup(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public double getPrice()
    {
        return this.beverage.getPrice() + ChoclateSyrupAddonPrice;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " " + "extra ChoclateSyrup";
    }
}
