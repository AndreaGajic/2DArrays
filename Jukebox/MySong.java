public class MySong
{
    private String title;
    private int rating;
    
    public MySong(){
        title = new String(" ");
        rating = 0;
    }
    
    
     public MySong(String title, int rating){
        this.title = title;
        this.rating = rating;
     }
    
    public int getRating(){
        return rating;
    }
    
    public String toSTring(){
        String songInfo = 
        "Title: " + title + " | Rating: " + rating + "\n";
        return songInfo;
    }
}
