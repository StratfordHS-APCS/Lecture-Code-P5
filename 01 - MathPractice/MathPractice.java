public class MathPractice
{
    /**
     * Returns a random double between 0 and max.
     */
    public static double random( int max )
    {
        double num = Math.random() * max;  // range is from 0 -> max.
        return num;
    }
}