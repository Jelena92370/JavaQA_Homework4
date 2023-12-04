import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3_Game {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cities = new HashSet<>();

        boolean continueGame = true;

        while (continueGame) {
            System.out.print("Player 1, please give your city name: ");
            String city1 = scanner.nextLine().toUpperCase();

            if (cities.contains(city1)) {
                System.out.println("This city has already been mentioned. Game over");
                continueGame = false;
                break;
            } else {
                cities.add(city1);
            }

            System.out.print("Player 1, please give your city name: ");
            String city2 = scanner.nextLine().toUpperCase();

            if (cities.contains(city2)) {
                System.out.println("This city has already been mentioned. Game over");
                continueGame = false;
                break;
            } else {
                cities.add(city2);
            }
        }
            System.out.println(cities);

    }
    }
