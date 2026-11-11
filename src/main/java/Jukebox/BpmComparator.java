package Jukebox;

import java.util.Comparator;

public class BpmComparator implements Comparator<SongV4> {

    public int compare(SongV4 one, SongV4 two) {
        return Integer.compare(one.getBpm(), two.getBpm());
    }

}
