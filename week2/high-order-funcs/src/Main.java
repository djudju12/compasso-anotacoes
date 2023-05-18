import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.IntUnaryOperator;

import static java.nio.file.Files.lines;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\jonathan\\Desktop\\repos\\compasso-anotacoes\\week2\\high-order-funcs\\src\\msgs.txt";
        try {
            lines(Path.of(path))
                    .filter((line) -> !line.toLowerCase().startsWith("promotions"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main2(String[] args) {
//
//        // Func Interface  | Lambda Expression                                       | Example
//        // Comsumer        | Receives a parameter and produces a side-effect         | x -> { code }
//        // Predicate       | Receives one parameter and produces a bool              | x -> { return bool }
//        // Function        | Receives one parameter and returns any value            | x -> { return value }
//        // BiConsumer      | Receives two parameters and produces a side-effect      | x, y -> { return code }
//        // Comparator      | Receives two parameters and returns a integer           | x, y -> { return int }
//        // BinaryOperator  | Receives two parameters and returns a value (same type) | x, y -> { return value }
//
//        // Consumer
//        List<String> f = Arrays.asList(
//            "Teste 1",
//            "Teste 2",
//            "Teste 3",
//            "Teste 4",
//            "Teste 5"
//        );
//        f.forEach(System.out::println);
//
//        // Comparator
//        List<Integer> inteiros = Arrays.asList(5, 858, 9, 43, 4, 8, 8);
//        inteiros.sort(Comparator.reverseOrder());
////        System.out.println(inteiros);
//        inteiros.sort(Integer::compareTo);
////        System.out.println(inteiros);
//
//        // BiConsumer
//        Map<String, Integer> hp = new HashMap<>();
//
//        hp.put("Teste1", 1);
//        hp.put("Teste2", 2);
//        hp.put("Teste3", 3);
//        hp.put("Teste4", 4);
//
//        hp.forEach((k, v) -> System.out.println("Key = " + k + " Value = " + v));

        // Stream Operations

        List<Double> prices = Arrays.asList(215.5, 5616.5, 654.85, 54.2);
        prices.stream()
                .filter((price) -> price > 100)
                .map(price -> price - 20)
                .sorted(Double::compareTo)
                .map(price -> "$" + price)
                .forEach(System.out::println);
    }
}