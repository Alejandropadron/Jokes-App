package lpadron.me.jokesapp;

/**
 * Created by luispadron on 11/5/15.
 */
public class Joke {

    private String jokeContent;
    private String artistName;

    public Joke(String jokeContent, String artistName) {
        this.jokeContent = jokeContent;
        this.artistName = artistName;
    }

    public String getJokeContent() {
        return jokeContent;
    }

    public void setJokeContent(String jokeContent) {
        this.jokeContent = jokeContent;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
