public class Amricano extends Beverage
{
    public Amricano()
    {
        this.description = "Americano";
    }

    @Override
    public double getPrice()
    {
       return 200.00;
    }

    @Override
    public String getDescription()
    {
        return this.description;
    }
}
