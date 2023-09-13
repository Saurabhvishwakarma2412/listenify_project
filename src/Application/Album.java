package Application;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String albumName;
    private List<Song> songList;
    private String artistName;
    public Album(String albumName, String artistName) {
    this(albumName,new ArrayList<>(),artistName);//constructor chaining
    }


    public Album(String albumName, List<Song> songList, String artistName) {
        this.albumName = albumName;
        this.songList = songList;
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean findSong(String Title){
        for(Song song : songList){
            if(song.getName().equals(Title)){
                return true;
            }
        }
        return false;
    }
    public String addNewSongToAlbum(String tile,double duration){
        if(findSong(tile)){
            return "song is present already";
        }
        Song song=new Song(tile,duration);
        this.songList.add(song);
        return "song is"+tile+"added";
    }
    public String addSongToPlaylist(int sonNum,List<Song> playlist){
        int index=sonNum-1;
        if(index>=0 && index<this.songList.size()) {
            Song found = this.songList.get(index);
            if (!playlist.contains(found)) {
                playlist.add(found);
                return "song added to playlist";
            }else{
                return "song is already present";
            }
        }else return "song song number is invalid";
    }
    public  String addSongToPlaylist(String title,List<Song> playlist){

        for(Song song:songList){
            if(song.getName().equals(title)){
                playlist.add(song);
                return "song is added int the playlist";
            }
        }
        return "song not found";

    }


}