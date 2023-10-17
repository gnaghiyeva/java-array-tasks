import java.util.Scanner;

public class sum_of_prime_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("sayı daxil et:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the number of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=0;
        for (int i = 2; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of the prime numbers: " + sum);
    }
}
