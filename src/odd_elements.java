import java.util.Scanner;

public class odd_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sayı daxil et:");
        int n = sc.nextInt();

        short[] arr = new short[n];
        System.out.print("Enter the number of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextShort();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
