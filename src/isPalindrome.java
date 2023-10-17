import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        int number, temp, reverse=0, rem, sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        number = sc.nextInt();

        temp=number;

        while (temp>0){
            rem=temp%10;
            reverse = reverse * 10 +rem;
            temp = temp/10;
        }

        if(number == reverse){
            while (number>0){
                sum=sum+(number%10);
                number=number/10;
            }

            System.out.println("sum="+sum);
        }
        else{
            System.out.println(number + "is not palindrome");
        }
    }
}
