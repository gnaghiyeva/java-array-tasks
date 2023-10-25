import java.util.Scanner;

public class mini_max_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max=0,sum=0;


        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        min=arr[0];
        max=arr[0];
        sum=min;
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];

            if(arr[i]<min){
                min=arr[i];
            }

            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println((sum-max)+" "+(sum-min));

    }
}
