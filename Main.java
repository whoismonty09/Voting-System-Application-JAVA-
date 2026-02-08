import java.util.HashMap;
import java.util.Scanner;

public class Main {   

    static HashMap<String, Integer> votes = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {   

        votes.put("Flexxy", 0);
        votes.put("Bob", 0);
        votes.put("John", 0);

        int choice;

        do {
            System.out.println("\n🗳 Voting System developed by Monty");
            System.out.println("1. Vote");
            System.out.println("2. View Results");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    castVote();
                    break;
                case 2:
                    viewResults();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }   

    static void castVote() {
        System.out.println("Candidates:");
        for (String candidate : votes.keySet()) {
            System.out.println("- " + candidate);
        }

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        if (votes.containsKey(name)) {
            votes.put(name, votes.get(name) + 1);
            System.out.println("✅ Vote recorded for " + name);
        } else {
            System.out.println("❌ Invalid candidate!");
        }
    }

    static void viewResults() {
        System.out.println("\n📊 Voting Results:");
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate) + " votes");
        }
    }
}
