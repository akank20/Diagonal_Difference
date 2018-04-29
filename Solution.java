import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
       
        int i,j, n=a.length;
        int d1sum=0, d2sum=0, diff;
        for(i=0;i<n;i++)
        {
            d1sum+=a[i][i];
        }
        for(i=n-1,j=0;i>=0;i--,j++)
        {
            d2sum+=a[i][j];
            
        }
        diff=d1sum-d2sum;
        return Math.abs(diff);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
