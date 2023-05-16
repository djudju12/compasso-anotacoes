public class Movie {
    private String name;
    private String format;
    private double rating;

    Movie(String name, String format, Double rating){
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie movie) {
        this.name = movie.name;
        this.format = movie.format;
        this.rating = movie.rating;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank or null");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("Format cannot be blank or null");
        }
        this.format = format;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10 ) {
            throw new IllegalArgumentException("Rating needs to be between 0 and 10");
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        String paddy = makeSpacePaddy(this.format.length(), 20);
        return String.format("%.2f", this.rating) + "\t" + this.format + paddy + this.name + "\n";
    }

    private static String makeSpacePaddy(int length, int diff) {
        String r = "";
        for (int i = 0; i < diff - length; i++) {
            r += " ";
        }
        return r;
    }

    public void setRating(float r) {
        this.rating = r;
    }
}
