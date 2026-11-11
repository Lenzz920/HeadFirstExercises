package Jukebox;

import java.util.*;

public class Jukebox8 {
    public static void main(String[] args) {
        new Jukebox8().go();
        new Jukebox8().equality();
    }

    public void go() {

        final Comparator<SongV4> SORT_BY_ASC_BPM= (one, two) -> Integer.compare(one.getBpm(), two.getBpm());

        List<SongV4> songList = new ArrayList<>(List.of(
                new SongV4("guess who's back", "eminem", 123),
                new SongV4("box", "zrtist", 32),
                new SongV4("flinstone", "flinstones", 42)));
        System.out.println(songList);

        songList.sort(new ArtistComparator());
        System.out.println(songList);

        songList.sort((o1, o2) -> o1.getArtist().compareTo(o2.getArtist()));
        System.out.println(songList);

        songList.sort(SORT_BY_ASC_BPM);
        System.out.println(songList);

        songList.sort((one, two) -> Integer.compare(two.getBpm(), one.getBpm()));
        System.out.println(songList);
    }

    public void equality() {
        SongV4 song1 = new SongV4("1", "2", 5);
        SongV4 song2 = new SongV4("1", "2", 5);

        Set<SongV4> songs = new HashSet<>(Set.of(song1, song2));
        System.out.println(songs);
    }
}

