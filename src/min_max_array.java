import java.util.Scanner;

public class min_max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n = sc.nextInt();

        System.out.print("m=");
        int m = sc.nextInt();

        System.out.print("enter the elements:");
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int min = arr[0][0];
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];

                } else if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("min :"+ min + " "+ " max :"+max);

    }
}
