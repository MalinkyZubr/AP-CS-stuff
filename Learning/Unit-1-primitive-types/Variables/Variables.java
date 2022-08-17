public class Variables 
{
    public static void main(String[] args)
    {
        int snapchatsSent = 353;
        System.out.print(String.format("Number of snapchats sent: %d\n", snapchatsSent));
        
        double youTubeVideosWatched = 130.5;
        System.out.print(String.format("Number of YouTube videos watched: %f\n", youTubeVideosWatched));
        
        String favoriteApp = "Instagram";
        System.out.print(String.format("Favorite app: %s\n", favoriteApp));

        youTubeVideosWatched = 240.4;
        System.out.print(String.format("Number of YouTube videos watched: %f\n", youTubeVideosWatched));
        
        char firstLetter = 'A';
        System.out.print(String.format("First letter: %c\n", firstLetter));
    }

}