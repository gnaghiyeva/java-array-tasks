import java.util.Scanner;

public class count_plus_minus_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,countPlus=0, countMinus=0, countZero=0,count=0;

        n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            count++;
           if(arr[i]>0){
               countPlus++;
           }
            if(arr[i]<0){
                countMinus++;
            }
            if(arr[i]==0){
                countZero++;
            }
        }


        System.out.println((double)countPlus/count);
        System.out.println((double)countMinus/count);
        System.out.println((double)countZero/count);


    }
}
