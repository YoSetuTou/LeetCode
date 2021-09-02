package code;

class CD {
    public Object print;
    private String title;
    private  String artist;
    private int numofTracks;
    public int playingtimes;
    private boolean gotIt = false;;
    private  String comment;

    public CD(String title, String artist, int numofTracks, int playingtimes, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingtimes = playingtimes;

        this.comment = comment;
    }

    public static void main(String[] args) {

    }

    public void print() {
        System.out.println(title+":"+artist);
    }
}
