import java.io.*;

public class ColumnSums {
	public static void main(String[] args) {
		int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };

        int[] columnSum;
        int columnSumLength = 0;
        for (int row = 0; row < data.length; row++) {
        	if (data[row].length > columnSumLength) {
        		columnSumLength = data[row].length;
        	}
        }

        columnSum = new int[columnSumLength];
        for (int row = 0; row < data.length; row++) {
        	for (int col = 0; col < data[row].length; col++) {
        		columnSum[col] += data[row][col];
        	}
        }

        for (int i = 0; i < columnSumLength; i++) {
        	System.out.println("The sum of column " + i + " is " + columnSum[i]);
        }
	}
}