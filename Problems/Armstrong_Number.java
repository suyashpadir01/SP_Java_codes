import java.util.Scanner;

public class Armstrong_Number{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        
        // to calculate number of digits
        int num_digits = String.valueOf(num).length();
        
        // calculate the sum of digits
        while(num > 0)
        {
            int digit = num % 10;
            sum += Math.pow(digit, num_digits);
            num /= 10;
        }
        
        if(original == sum)
        {
            System.out.println("Given number is an Armstrong number");
        }
        else
        {
            System.out.println("Given number is not an Armstrong number");
        }
        sc.close();
    }
}