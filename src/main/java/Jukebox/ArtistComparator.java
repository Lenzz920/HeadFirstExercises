package Jukebox;

import java.util.Comparator;

public class ArtistComparator implements Comparator<SongV4> {

    public int compare(SongV4 one, SongV4 two) {
        return one.getArtist().compareTo(two.getArtist());
    }

}
