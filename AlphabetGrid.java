import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AlphabetGrid
{
    public static void main(String[] args){
        int rows = Integer.parseInt(JOptionPane.showInputDialog("How many rows do you want?"));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("How many columns do you want?"));
        String[][] grid = new String[rows][cols];
        
        String choice = JOptionPane.showInputDialog("Choose upercase, lowercase, or numbers");
        
        ArrayList<String> fillerType = new ArrayList<String>();
        
        if(choice.equalsIgnoreCase("uppercase")){
            fillerType.add("A");
            fillerType.add("B");
            fillerType.add("C");
            fillerType.add("D");
            fillerType.add("E");
            fillerType.add("F");
            fillerType.add("G");
            fillerType.add("H");
            fillerType.add("I");
            fillerType.add("J");
            fillerType.add("K");
            fillerType.add("L");
            fillerType.add("M");
            fillerType.add("N");
            fillerType.add("O");
            fillerType.add("P");
            fillerType.add("Q");
            fillerType.add("R");
            fillerType.add("S");
            fillerType.add("T");
            fillerType.add("U");
            fillerType.add("V");
            fillerType.add("W");
            fillerType.add("X");
            fillerType.add("Y");
            fillerType.add("Z");
        }
        else if(choice.equalsIgnoreCase("lowercase")){
           fillerType.add("a");
            fillerType.add("b");
            fillerType.add("c");
            fillerType.add("d");
            fillerType.add("e");
            fillerType.add("f");
            fillerType.add("g");
            fillerType.add("h");
            fillerType.add("i");
            fillerType.add("j");
            fillerType.add("k");
            fillerType.add("l");
            fillerType.add("m");
            fillerType.add("n");
            fillerType.add("o");
            fillerType.add("p");
            fillerType.add("q");
            fillerType.add("r");
            fillerType.add("s");
            fillerType.add("t");
            fillerType.add("u");
            fillerType.add("v");
            fillerType.add("w");
            fillerType.add("x");
            fillerType.add("y");
            fillerType.add("z"); 
        }
        else if(choice.equalsIgnoreCase("numbers")){
            fillerType.add("0");
            fillerType.add("1");
            fillerType.add("2");
            fillerType.add("3");
            fillerType.add("4");
            fillerType.add("5");
            fillerType.add("6");
            fillerType.add("7");
            fillerType.add("8");
            fillerType.add("9");
        }
        
        int counter = 0;
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                grid[row][col] = fillerType.get(counter) + "\t";
                counter++;
                if(counter == fillerType.size()){
                    counter = 0;
                }
            }
        }   
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col]);
                }
                System.out.println();
            }
        }
   }


