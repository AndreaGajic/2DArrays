import javax.swing.JOptionPane;


/*
 * Andrea's Notes:
 * 
 * Summary: Similar to the guess a number game, only one must guess the correct row
 * and column, not just one correct number. (While working, refer to GuessNumber
 * and SearchArray).
 * 
 * 1. Create 2D array with input for rows and columns
 *    int[][] gameBoard = new int[x][y];
 * 2. Fill the board with random numbers! Use a for loop. 
 * 3. Math.random() to pick a random row and column to put the 0 in. (similar to when creating original board, set two ints to the random numbers and then set that cell to 0
 * 4. Print the 2D array using an x instead of a number (create new string array with all values set to X)
 * 5. with dialog box, ask for number (JOption.Pane.showInputDialog)
 * 6. If guess is right, say yay. If not, say failure and how far they were off by. Use math.abs for difference. Use boolean to verify game isn't over
 * 7. Print the array, this time revealing the position of the guessed number
 */
public class GuessingGame
{
    public static void main (String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("How many rows do you want your gameboard to have?")); //sets x (number of rows) to users desired input
        int y = Integer.parseInt(JOptionPane.showInputDialog("How many columns do you want your gameboard to have?"));//sets y (number of cols) to users desired input
        int[][] gameBoard = new int[x][y]; //creates gameBoard of requested size
        boolean keepPlaying = true; //set up boolean for stopping code from repeating
        //we have completed step 1 now step 2
        
        for(int row = 0; row < gameBoard.length; row++){
            for(int col = 0; col < gameBoard[row].length; col++){ //use those for loops to go through the array
                int num = (int)(Math.random()*30+1); // generate random numbers from 1 to 30
                gameBoard[row][col] = num; //fill up the board with said random numbers
         }
       }
       //Houston, step 2 is complete. Onto step 3.
       int randCol = (int)(Math.random()*y); //pick a random column
       int randRow = (int)(Math.random()*x); //pick a random row
       gameBoard[randRow][randCol] = 0; //put 0 in the random (row,column)
       
       //succesful completion of step 3. Moving on to step 4.
       String[][] newBoard = new String[x][y]; //mystery game board (game board but without the numbers
        for(int xx = 0; xx < newBoard.length; xx++){
            for(int yy = 0; yy < newBoard[0].length; yy++){ //loop throug the board
                newBoard[xx][yy] = "x"; //set all values to X
                System.out.print(newBoard[xx][yy] + " "); //print out the "mystery" board
            }
            System.out.println();
        }
        
        //step 4 has been completed. Steps 5, 6, and 7 coming right up.
        while(keepPlaying){ //while the boolean is true, keep the while loop going. when it's false, stop.
        int guessRow = Integer.parseInt(JOptionPane.showInputDialog("Which row is the 0 in?")); //gets user's guess for what the row is
        int guessCol = Integer.parseInt(JOptionPane.showInputDialog("Which column is the 0 in?"));//gets user's guess for what the column is
        
        
        for(int r = 0; r< gameBoard.length; r ++){
            for(int c = 0; c < gameBoard[0].length; c++){ //loop through it all again
                if((guessRow == randRow) && (guessCol == randCol)){ //if the row and column are correct
                    JOptionPane.showMessageDialog(null, "You did it!"); //you did it.
                    keepPlaying = false; //stop code
                    System.exit(1); //make sure the code actually stops
             }
             else{//if the guess for row and col are wrong, do the following
                //JOptionPane.showMessageDialog(null, "No dice", "Failure");
                int rowDiff = Math.abs(guessRow-randRow); //find how off the guess for the row is
                int colDiff = Math.abs(guessCol - randCol); //find how off the guess for the column is
                JOptionPane.showMessageDialog(null, "Guess off by: " + rowDiff + "rows and " + colDiff + " columns", "It's off by...", JOptionPane.INFORMATION_MESSAGE);//tell user how off they are
                //newBoard[guessRow][guessCol] = "N"; //test run with N instead of revealed number, as shown in class
                String reveal = Integer.toString(gameBoard[guessRow][guessCol]); //convert "revealed" number to String so it can be in mystery board
                newBoard[guessRow][guessCol] = reveal; //put revealed number into board
                for(int xx = 0; xx < newBoard.length; xx++){
            for(int yy = 0; yy < newBoard[0].length; yy++){ //loop throug the board
                System.out.print(newBoard[xx][yy] + " "); //print board with the revealed number
            }
            System.out.println();
        }
        //repeat asking for row and column input from user
                guessRow = Integer.parseInt(JOptionPane.showInputDialog("Which row is the 0 in?")); //gets user's guess for what the row is
                guessCol = Integer.parseInt(JOptionPane.showInputDialog("Which column is the 0 in?"));//gets user's guess for what the column is
            }
        }
    }
}
         
        
    }
}
