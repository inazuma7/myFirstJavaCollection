
import java.util.Scanner;

class IfElseElse {
    public static void main(String args[]) {
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number > 0) {
            System.out.println("Positive Number!");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("It's Zero!");
        }
    }
}
