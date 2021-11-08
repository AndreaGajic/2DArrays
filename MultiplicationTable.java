import javax.swing.JOptionPane;

public class MultiplicationTable
{
    public static void main(String[] args){
        int rows = Integer.parseInt(JOptionPane.showInputDialog("How many rows do you want?"));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("How many columns do you want?"));
        int[][] grid = new int[rows][cols]; 
        
      for(int row = 0; row<grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
              if(row == 0){
                    grid[row][col] = col;
                    System.out.print(grid[row][col] + "\t");
                }
              else if(col ==0){
                    grid[row][col] = row;
                    System.out.print("\n" + grid[row][col] + "\t");
              }
              else{
                grid[row][col] = row*col;
                System.out.print(grid[row][col] + "\t");
            }
          }
        }
        System.out.println();
    }
}
