import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieStore {

    private List<Movie> movies;

    MovieStore() {
        this.movies = new ArrayList<>();
    }

    MovieStore(List<Movie> movies) {
        this.movies = new ArrayList<>(movies);
    }


    MovieStore(String pathFile) throws FileNotFoundException {
        this.movies = loadMovies(pathFile);
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie m) {
        this.movies.set(index,  new Movie(m));
    }

    public void addMovie(Movie m) {
        this.movies.add(new Movie(m));
    }

    private static List<Movie> loadMovies(String filePath) throws FileNotFoundException {
        List<Movie> movies = new ArrayList<Movie>();
        FileInputStream f = new FileInputStream(filePath);
        Scanner scanFile = new Scanner(f);

        while(scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split(",");
            movies.add(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        return movies;
    }

    @Override
    public String toString() {
        String s = "******************************MOVIE STORE*****************************\n";

        for (Movie m :
                this.movies) {
            if (m == null) { return s; }
            s += m.toString();
        }
        return s;
    }
}
