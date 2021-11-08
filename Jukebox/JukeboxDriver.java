public class JukeboxDriver
{
    public static void main(String[] args){
    Jukebox juke = new Jukebox();
    
    System.out.print(juke);
    
    juke.randomSong();
    
    juke.playSongOfRating(3);
   }
}
