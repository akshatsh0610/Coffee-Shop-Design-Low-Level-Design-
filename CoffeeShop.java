public class CoffeeShop
{
    public static void main(String[] args)
    {

         Beverage amricano = new Amricano();
         amricano = new Milk(amricano);
         amricano = new Milk(amricano);
         amricano = new Milk(amricano);
         amricano = new Milk(amricano);
         amricano = new Caremel(amricano);


//         System.out.println(amricano.getDescription());
//         System.out.println(amricano.getPrice());

        Beverage dalgona = new Dalgona();
        dalgona = new Milk(dalgona);
        dalgona = new Caremel(dalgona);
        dalgona = new ChoclateSyrup(dalgona);

        System.out.println(dalgona.getDescription());
        System.out.println(dalgona.getPrice());


    }
}
