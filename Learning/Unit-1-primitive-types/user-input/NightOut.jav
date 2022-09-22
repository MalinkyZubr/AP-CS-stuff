import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How much did dinner cost?");
        double dinnerCost = input.nextDouble();
        System.out.println("How much is mini-golf for one person?");
        double miniGolfCost = input.nextDouble() * 2;
        System.out.println("How much did dessert cost?");
        double dessertCost = input.nextDouble();
        
        double total = dinnerCost + miniGolfCost + dessertCost;
        
        System.out.println(String.format("Dinner: $%f\n" +
                                         "Mini-Golf: $%f\n" +
                                         "Dessert: $%f\n" +
                                         "Grand Total: $%f\n",
                                         dinnerCost,
                                         miniGolfCost,
                                         dessertCost,
                                         total));
        
    }
}