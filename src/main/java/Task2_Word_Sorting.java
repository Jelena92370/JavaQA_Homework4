import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task2_Word_Sorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSet<String> words = new TreeSet<>();

        System.out.println("Please write down 5 words:");
        for (int i = 0; i < 5; i++) {
            words.add(scanner.nextLine());
        }

        if (words.isEmpty()) {
            System.out.println("You need to write down 5 words");
        } else {
            System.out.println("First word in alphabetic order: " + words.first());
            System.out.println("Last word in alphabetic order: " + words.last());
        }


    }
}
