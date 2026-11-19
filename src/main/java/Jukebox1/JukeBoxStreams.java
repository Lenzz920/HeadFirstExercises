package Jukebox1;

import java.util.List;
import java.util.stream.Collectors;

public class JukeBoxStreams {

    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        System.out.println(songs);

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getYear() < 1995)
                .toList();

        rockSongs.forEach(System.out::println);

        List<String> genres = songs.stream()
                .map(Song::getGenre)
                .distinct()
                .toList();

        genres.forEach(System.out::println);
    }

}
