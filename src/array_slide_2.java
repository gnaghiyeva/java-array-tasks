import java.util.Scanner;

public class array_slide_2 {
    // 2 1 5 8 9    -----   8 9 2 1 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;

        System.out.print("n=");
        n = sc.nextInt();

        System.out.print("k=");
        k = sc.nextInt();


        int[] arr = new int[n];
        System.out.print("Enter the number of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < k; i++) {
            int j, last;

            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
