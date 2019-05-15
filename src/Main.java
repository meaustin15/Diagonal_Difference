import java.util.Scanner;
import java.lang.Math;

public class Main {

    static int diagonalDifference(int[][] arr){
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        int n = arr.length;

            for(int x=0, y = n-1; x < n; x++, y--){
                sum1 += arr[x][x];
                sum2 += arr[y][x];
            }


        sum = Math.abs(sum1 - sum2);

        return sum;
    }

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
   // System.out.println("Enter Array Length");
    int n = in.nextInt();
    int[][] arr = new int[n][n];
    int size = arr.length;
       // System.out.println("Array Length: " + size);

        //System.out.println("Enter Array Data");
    for(int x = 0; x < size; x++){
        for(int y = 0; y < size; y++){
            int num = in.nextInt();
           // System.out.println(x + " " + y);
            arr[x][y] = num;
        }


    }
        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
