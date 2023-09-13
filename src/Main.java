import Application.Album;
import Application.Song;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Album a1 = new Album("tera zikr", "darshal raval");
        a1.addNewSongToAlbum("tera zikr", 4.5);
        a1.addNewSongToAlbum("do din", 3.5);
        a1.addNewSongToAlbum("kash aisa be hota", 4.5);
        List<Song> mylist = new ArrayList<>();
        String a = a1.addSongToPlaylist(1, mylist);

        Album b2 = new Album("brown rang", "Honey Sing");
        b2.addNewSongToAlbum("brown rang", 3.5);
        b2.addNewSongToAlbum("char botal vodka",4.4);
        String m=b2.addSongToPlaylist("brown rang",mylist);
        System.out.print(a+"\n"+m+"\n");
        for(Song song:mylist){
            System.out.println(song.toString());
        }
    }
}