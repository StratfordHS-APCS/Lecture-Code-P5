public class ArraysAndLists
{
    public static int[] arrayTimes2( int[] arr )
    {
        for( int i = 0; i < arr.length; i++ )
        {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
    
    public static void printArray( int[] arr )
    {
        for( int value : arr )
        {
            System.out.print( value + ", " );
        }
        System.out.println();
    }
    
    public static void main( String[] args )
    {
        int[] arr = { 0,1,2,3,4,5,6 };
        System.out.println( "Original Array" );
        printArray( arr );
        
        int[] arr2 = arrayTimes2( arr );            // This will modify the original array [Not Good]
        //int[] arr2 = arrayTimes2( arr.clone() );  // This will send a copy of the array [Good]
        
        System.out.println( "Doubled Array");
        printArray( arr2 );
        
        System.out.println( "Original Array" );
        printArray( arr );
    }
}






