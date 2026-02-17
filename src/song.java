public class song {
    private String title;
    private String artist;
    private double length;
    public song(String title, String artist, double length) {
        this.artist = artist;
        this.length = length;
        this.title = title;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
