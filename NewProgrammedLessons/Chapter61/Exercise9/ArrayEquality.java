import java.util.Arrays;

class ArrayEquality {
  public static boolean myEquals( int[] a, int[] b ) {
    Boolean equality = true;
    if (a == null || b == null) {
      return false;
    }
    if (a.length != b.length) {
      equality = false;
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        equality = false;
        i = a.length;
      }
    }

    return equality;
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };
    int[] arrayC = {1};
    int[] arrayD = {1};

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( myEquals( arrayB, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );

    System.out.print("myEquals says: ")    ;
    if ( myEquals( arrayC, arrayD ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );        
  }
}