import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SearchArray
{
    public static void main(String[] args){
        int[][] grid = new int[3][4];
        int chosenNum = 5;
        boolean flag = false;
        
        for(int row = 0; row< grid.length; row ++){
            for(int col = 0; col < grid[0].length; col++){
                grid[row][col] = (int)(1 + Math.random()*9);
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
        
        
        for(int row = 0; row< grid.length; row ++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == chosenNum){
                    System.out.print(chosenNum + " is found in row: " + row + " and column: " + col);
                    flag = true;
                }
            }
            System.out.println();
        }
        
        if(flag == false){
            System.out.print("The number " + chosenNum + " is not in this grid.");
        }
    }
}
