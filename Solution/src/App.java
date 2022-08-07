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
            
            // creando nodos.
            ArrayList<Node> NodeList = new ArrayList<Node>();

            System.out.println("---------PRINTING NODES-----------");
            for (int i=0; i < array.length ; i++){
                for (int j=0; j < array[0].length; j++){
                    Node pivot = new Node();
    
                    if (i==0 & j==0){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(-1, -1, -1);
                        pivot.setDown(i+1, j, array[i+1][j]);
                        pivot.setLeft(-1, -1, -1);
                        pivot.setRight(i, j+1, array[i][j+1]);
    
                    }else if (i==0 & j==array[0].length-1){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(-1, -1, -1);
                        pivot.setDown(i+1, j, array[i+1][j]);
                        pivot.setLeft(i, j-1, array[i][j-1]);
                        pivot.setRight(-1, -1, -1);
    
                    }else if (i==array.length-1 & j==0){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(i-1, j, array[i-1][j]);
                        pivot.setDown(-1, -1, -1);
                        pivot.setLeft(-1, -1,-1);
                        pivot.setRight(i, j+1, array[i][j+1]);
    
                    }else if (i==array.length-1 & j==array[0].length-1){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(i-1, j, array[i-1][j]);
                        pivot.setDown(-1, -1, -1);
                        pivot.setLeft(i, j-1, array[i][j-1]);
                        pivot.setRight(-1, -1, -1);
    
                    }else if (i==0 & 0<j & j<array[0].length-1){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(-1, -1, -1);
                        pivot.setDown(i+1, j, array[i+1][j]);
                        pivot.setLeft(i, j-1, array[i][j-1]);
                        pivot.setRight(i, j+1, array[i][j+1]);
    
                    }else if (j==0 & 0<i & i<array.length-1){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(i-1, j, array[i-1][j]);
                        pivot.setDown(i+1, j, array[i+1][j]);
                        pivot.setLeft(-1, -1, -1);
                        pivot.setRight(i, j+1, array[i][j+1]);
    
                    }else if (j==array[0].length-1 &0<i & i<array.length-1){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(i-1, j, array[i-1][j]);
                        pivot.setDown(i+1, j, array[i+1][j]);
                        pivot.setLeft(i, j-1, array[i][j-1]);
                        pivot.setRight(-1, -1, -1);
    
                    }else if (i==array.length-1 &  0<j & j<array[0].length-1){
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(i-1, j, array[i-1][j]);
                        pivot.setDown(-1, -1, -1);
                        pivot.setLeft(i, j-1, array[i][j-1]);
                        pivot.setRight(i, j+1, array[i][j+1]);
    
                    }else{
    
                        pivot.setId1(i);
                        pivot.setId2(j);
                        pivot.setValue(array[i][j]);
                        pivot.setUp(i-1, j, array[i-1][j]);
                        pivot.setDown(i+1, j, array[i+1][j]);
                        pivot.setLeft(i, j-1, array[i][j-1]);
                        pivot.setRight(i, j+1, array[i][j+1]);
    
    
                    }
    
                    
                   NodeList.add(pivot);
    
               }
           }
    
           System.out.println("The size of the ArrayList is: " + NodeList.size());
    
    
            for(Node pd : NodeList) {
                System.out.println(pd);
            }





        }

        catch (Exception e) {
            System.out
            .println("Error: file not found or insufficient requirements.");
        }
        
    }
}
