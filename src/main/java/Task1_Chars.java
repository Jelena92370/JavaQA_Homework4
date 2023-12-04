import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_Chars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please write down your line: ");
        String input = scanner.nextLine();

        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicatedChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            } else {
                duplicatedChars.add(c);
            }
        }

        int uniqueCount = uniqueChars.size();
        int duplicatedCount = duplicatedChars.size();

        System.out.println("Count of unique chars: " + uniqueCount);
        System.out.println("Count of duplicated chars: " + duplicatedCount);

    }
}

