public class Jukebox
{
    private MySong[][] songList;
    
    public Jukebox(){
        songList[0][0] = new MySong( "Keep the Car Running", 5 );
        songList[0][1] = new MySong( "London Calling", 4 );
        songList[0][2] = new MySong( "Man in Black", 3 );
        songList[0][3] = new MySong( "Space Oddity", 2 );
        songList[1][0] = new MySong( "Ring of Fire", 5 );
        songList[1][1] = new MySong( "Sorrow", 2 );
        songList[1][2] = new MySong( "One", 4 );
        songList[1][3] = new MySong( "With or Without You", 3 );
        songList[2][0] = new MySong( "Ditmas", 2 );
        songList[2][1] = new MySong( "Wish You Were Here", 2 );
        songList[2][2] = new MySong( "Purple Haze", 5 );
        songList[2][3] = new MySong( "Hotel California", 1 );

    }
    
    public String toString(){
        String output = "";
        
        for(MySong[] row: songList){
            for(MySong song: row){
                output += song;
            }
        }
        return output;
    }
    
    public void randomSong(){
        int randomRow = (int)(Math.random()*3);
        int randomCol = (int)(Math.random()*4);
        System.out.println("\nRnadom song:");
        System.out.println(songList[randomRow][randomCol]);
    }
    
    public void playSongOfRating(int songRating){
        System.out.println("Songs with a rating of " + songRating + ":");
        
        for(int r = 0; r < songList.length; r++){
            for(int c = 0; c < songList[r].length; c++){
                if(songList[r][c].getRating() == songRating){
                    System.out.print(songList[r][c]);
                }
            }
        }
    }
            
}
