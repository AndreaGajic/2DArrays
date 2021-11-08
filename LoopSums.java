public class LoopSums
{
   public static void main(String[] args){
       int[][] grid = new int[3][5];
       
       int nums = 1;
       int total = 0;
       for(int r = 0; r < grid.length; r++){
           for(int c = 0; c < grid[r].length; c++){
               grid[r][c] = nums;
               System.out.print(grid[r][c] + " ");
               total += nums;
               nums++;
            }
            System.out.println();
        }
       System.out.println("nThe sum of all numbers in the grid is: " + total);
  
    int rowTotal = 0;
     for(int r = 0; r < grid[0].length; r++){
           for(int c = 0; c < grid.length; c++){
               rowTotal += grid[r][c];
            }
            System.out.println("The sum of row " + r + " is " + rowTotal);
            rowTotal = 0;
        }
       
    int colTotal = 0;
     for(int c = 0; c < grid[0].length; c++){
           for(int r = 0; r < grid.length; r++){
               colTotal += grid[r][c];
            }
            System.out.println("The sum of column " + c + " is " + colTotal);
            colTotal = 0;
        }
        
        
}
}
