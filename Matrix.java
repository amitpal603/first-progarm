import java.io.*;
import java.lang.*;

public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[3][3];  // 3x3 array

        // Input values
        System.out.println("Enter 9 elements for 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // Print matrix
        System.out.println("The 3x3 Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
