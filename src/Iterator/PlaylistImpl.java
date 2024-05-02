import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist{
    List<Song> songs = new ArrayList<>();
    public Iterator<Song> createIterator() {
        return new PlayListIterator(songs);
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
