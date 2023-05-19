public class Caremel extends BeverageDecorator
{
    private static final int CaremelAddonPrice = 60;
    Beverage beverage;

    public Caremel(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public double getPrice()
    {
        return this.beverage.getPrice() + CaremelAddonPrice;
    }

    @Override
    public String getDescription()
    {
        return this.beverage.getDescription() + " " + "extra Caremel";
    }
}
