import java.util.Scanner;

class ifElse {
    public static void main(String args[]) {
        int otp = 2514;
        int userInput;

        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();
        if (userInput == 2514) {
            System.out.println("Verification Complete");
        } else {
            System.out.println("Verification Failed");
        }
        System.out.println("End of the process...");
    }
}
