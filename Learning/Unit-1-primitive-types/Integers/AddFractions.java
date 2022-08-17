public class AddFractions 
{
    public static void main(String[] args)
    {
        int numerator1 = 5;
        int denominator1 = 12;
        int numerator2 = 15;
        int denominator2 = 27;
        String sum = String.format("%d / %d", ((numerator1 * denominator2) + (numerator2 * denominator1)), denominator1 * denominator2);
        System.out.println(String.format("The numerator of the first fraction is %d\n" + 
                                         "The denominator of the first fraction is %d\n" +
                                         "The numerator of the second fraction is %d\n" +
                                         "The denominator of the second fraction is %d\n" +
                                         "the sum of %d/%d + %d/%d = %s",
                                          numerator1, denominator1,
                                          numerator2, denominator2,
                                          numerator1, denominator1,
                                          numerator2, denominator2,
                                          sum));
    }
}