import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any Natural Number");
        int number = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The Sum of first Natral number is " + sum);
    }
}