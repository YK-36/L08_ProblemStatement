package sg.edu.rp.c346.id22015127.problemstatement;

public class Song {
    private int id;
    private String title;
    private String singer;
    private Integer year;
    private String stars;
    public Song(int id, String title, String singer, Integer year, String stars) {
        this.id = id;
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.stars = stars;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getSinger() {
        return singer;
    }
    public Integer getYear() {
        return year;
    }
    public String getStars() {
        return stars;
    }
    public String toString() {
        return id + "\n" + "Song Title: " + title + "\n" + "Singer Name: " + singer + "\n" + "Year of Song Release: " + year + "\n" + "Rating: " + stars + "/5 stars";
    }
}
