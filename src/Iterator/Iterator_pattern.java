public class Iterator_pattern {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();

        playlist.addSong(new Song("just my universe", "Qairosh"));
        playlist.addSong(new Song("candy shop", "50 cent"));
        playlist.addSong(new Song("kimenababak", "mc Sailaubek"));

        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}
