import java.io.* ;

public class LargestElements
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int rowMax;
    
    for ( int row=0; row < data.length; row++)
    {
      rowMax = data[row][0];
      for ( int col=0; col < data[row].length; col++) 
      {
         if (data[row][col] > rowMax) {
          rowMax = data[row][col];
         }
      }
      System.out.println("The max for row " + row + " is " + rowMax);
    }
      
  }
}      