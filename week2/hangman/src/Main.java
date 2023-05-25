import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readWords();

    }
    private static void readWords() {
        try(BufferedReader br = new BufferedReader(new FileReader("/home/jonathan/repos/compasso-anotacoes/week2/hangman/src/words.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            String[] words;
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
//            String everything = sb.toString();
//            System.out.println(everything);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}