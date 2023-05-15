// 1. Which country held the 2016 Summer Olympics?
//     	a) China
//     	b) Ireland
//     	c) Brazil
//     	d) Italy
// c


// 2. Which planet is the hottest?
//     	a) Venus
//     	b) Saturn
//     	c) Mercury
//     	d) Mars
// a


// 3. What is the rarest blood type?
//     	a) O
//     	b) A
//     	c) B
//     	d) AB-Negative


// d


// 4. Which one of these characters is friends with Harry Potter?
//     	a) Ron Weasley
//     	b) Hermione Granger
//     	c) Draco Malfoy


// a

import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String r;
        int total = 0;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
        r = s.nextLine();
        total += ("c".equals(r.toLowerCase())) ? 5 : 0;

        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars");
        r = s.nextLine();
        total += ("a".equals(r.toLowerCase())) ? 5 : 0;

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative");
        r = s.nextLine();
        total += ("d".equals(r.toLowerCase())) ? 5 : 0;
        
        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        r = s.nextLine();
        total += ("a".equals(r.toLowerCase()) || "b".equals(r.toLowerCase())) ? 5 : 0;

        s.close();

        System.out.println(total);
        if (total >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if ((total < 15) && (total >= 5)) {
            System.out.println("Not Bad!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}