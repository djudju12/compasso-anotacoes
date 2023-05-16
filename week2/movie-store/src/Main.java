import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        MovieStore store = new MovieStore();
        int opc = 0;
        System.out.println("Bem vindo a loja de filmes. Como deseja carregar seus filmes?");
        opc = s.nextInt();
        switch (opc) {
            case 1 -> store = carregarArquivo(s);
            case 2 -> store = carregarManualmente(s);
            default -> entradaInvalida();
        }

        s.close();
        System.out.println(store);
    }

    private static MovieStore carregarManualmente(Scanner s){
        MovieStore movies = new MovieStore();

        boolean continuar = true;
        while (continuar) {
            String name, format, rating;
            System.out.println("Nome do filme: ");
            s.nextLine();
            name = s.nextLine();
            if (checkString(name)) {
                System.out.println("Dado invalido!");
                continue;
            }

            System.out.println("Format filme: ");
            format = s.nextLine();
            if (checkString(format)) {
                System.out.println("Dado invalido!");
                continue;
            }

            System.out.println("Rating: ");
            rating = s.nextLine();
            if (checkString(rating)) {
                System.out.println("Dado invalido!");
                continue;
            }

            movies.addMovie(new Movie(name, format, Double.parseDouble(rating)));
            System.out.println("Deseja adicionar mais filmes? Y/N");
            continuar = s.next().equals("Y") ? true : false;
        }
        return movies;
    }

    private static boolean checkString(String name) {
        return name == null || name.isBlank();
    }


    private static MovieStore carregarArquivo(Scanner s){
        System.out.println("Insira o path para o arquivo:");
//        s.nextLine();
        while (true) {
            String path = s.next();
            try {
                return new MovieStore(path);
            } catch (FileNotFoundException e) {
                System.out.println("Path => " + path + " invalido. Tente novamente!");
            }
        }
    }


    private static void entradaInvalida() {
        System.out.println("Por favor forneca uma opcao valida!");
    }
}