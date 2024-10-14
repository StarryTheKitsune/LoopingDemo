import java.util.Random;
import java.util.Scanner;
public class WhileDemo {
    public static void main(String[] args) {
        Random gen = new Random();
        int die1 = -1;
        int die2 = 0;
        int die3 = 1;
        int dieRoll = 0;
        int sum = 0;
        String input = "";
        boolean playing = true;
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Roll\tDie 1\tDie 2\tDie 3\tSum");
            do {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieRoll++;
                sum = die1 + die2 + die3;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d", dieRoll, die1, die2, die3, sum);
                System.out.println();
            } while (!(die1 == die2 && die2 == die3));
            System.out.println("All dice match!");
            do {
                System.out.println("Would you like to continue playing? [Y/N]");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    validInput = true;
                } else if (input.equalsIgnoreCase("N")) {
                    playing = false;
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please try again");
                    sc.nextLine();
                }
            }while (!(validInput));
        } while (playing);
        System.out.println("Thank you for playing!");
    }
}
