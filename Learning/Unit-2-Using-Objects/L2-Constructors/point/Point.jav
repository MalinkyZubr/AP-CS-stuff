/**
 * The Point class keeps track of a point on
 * a coordinate plane. Each Point has
 * an x and y coordinate.
 */
public class Point
{
    // Attributes
    private int x;
    private int y;
    
    // Constructor
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    // Let us print
    public String toString()
    {
        return x + ", " + y;
    }
}