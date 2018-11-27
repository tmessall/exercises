import java.util.Arrays;

class ArraySameElements
{
  public static boolean sameElts( int[] a, int[] b ) {
    int maxA = 0;
    int maxB = 0;
    int minA = 0;
    int minB = 0;
    if (a == null && b == null) {
      return true;
    } else if (a == null || b == null) {
      return false;
    }
    if (a.length != b.length) {
      return false;
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] > maxA) {
        maxA = a[i];
      } else if (a[i] < minA) {
        minA = a[i];
      }

      if (b[i] > maxB) {
        maxB = b[i];
      } else if (b[i] < minB) {
        minB = b[i];
      }
    }

    if ((maxB != maxA) || (minB != minA)) {
      return false;
    }

    int[] aValues = new int[maxA - minA];
    int[] bValues = new int[maxB - minB];

    for (int i = 0; i < aValues.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[j] == minA + i) {
          aValues[i]++;
        }
        if (b[j] == minB + i) {
          bValues[i]++;
        }
      }
    }

    if (Arrays.equals(aValues, bValues)) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2, 6, 2, 28, 9 };
    int[] arrayB = { 4, 2, 3, 2, 1, 28, 2, 9, 6, };

    if ( sameElts( arrayA, arrayB ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );      
 
  }
}