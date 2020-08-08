import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.pritnln("The Addition of " + (num1) + " and " + (num2) + "is: " + (result));
    }
}