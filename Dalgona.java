public class Dalgona extends Beverage
{
    public Dalgona()
    {
         this.description = "Dalgona";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return 300;
    }
}
