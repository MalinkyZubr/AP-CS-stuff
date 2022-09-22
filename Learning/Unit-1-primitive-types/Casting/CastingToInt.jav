import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double myDouble = input.nextDouble();
        int myInt = (int)myDouble;
        
        System.out.println(myInt);
    }
}