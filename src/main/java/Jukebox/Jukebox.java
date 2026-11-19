package Jukebox;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Jukebox {

    public static void main(String[] args) {
        Set<Song> songsSet = new HashSet<>();
        songsSet.add(new Song("one"));
        songsSet.add(new Song("one"));

        //System.out.println(songsSet.size());

        Map<String, String> map = new HashMap<>();

        System.out.println(map.put("1", "2"));
//        System.out.println(map.put("2", "4"));
        System.out.println(map.put("1", "3"));
        System.out.println(map.get("1"));
//        System.out.println(map.get("4"));
//        System.out.println(map.containsKey("1"));
//        System.out.println(map.containsKey("6"));

    }

}

class Song {
    String title;

    Song(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object aSong) {
        Song other = (Song) aSong;
        return title.equals(other.title);
    }

    public int hashCode() {
        return title.hashCode();
    }

}
