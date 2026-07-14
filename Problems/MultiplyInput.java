import java.util.Scanner;

class MultiplyInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first float: ");
        float a = sc.nextFloat();

        System.out.print("Enter second float: ");
        float b = sc.nextFloat();

        System.out.println("Multiplication = " + (a * b));
    }
}