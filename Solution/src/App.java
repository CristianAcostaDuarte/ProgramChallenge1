import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Scanner sc = new Scanner(new File("map.txt"));
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] array = new int[rows][columns];
            while (sc.hasNext()) {
                for (int row = 0; row < rows; row++) {
                    for (int column = 0; column < columns; column++) {
                        array[row][column] = sc.nextInt();
                        System.out.printf("%2d ", array[row][column]);
                    }
                    System.out.println();
                }

            }
            sc.close();
            System.out.println(array[0].length);
        }

        catch (Exception e) {
            System.out
            .println("Error: file not found or insufficient requirements.");
        }
        
    }
}
