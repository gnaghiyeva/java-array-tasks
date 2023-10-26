import java.util.Scanner;

public class product_of_divisors {

    public static int findProduct(int a, int b, int n){
       int product = 1;
        for (int i = 1; i <=n ; i++) {
            if(i%a==0 && i%b==0){
                product=product*i;
            }

        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();

        int result = findProduct(a,b,n);
        System.out.println(result);
    }
}
