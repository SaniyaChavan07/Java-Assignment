import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime;
        if (n <= 1) {
            isPrime = false;
        }
        else if (n == 2) {
            isPrime = true;
        }
        else if(n % 2 == 0){
            isPrime = false;
        } else{
            isPrime = true;
        }
        if(isPrime){
            System.out.println(n +" is a prime number");
        }else {
            System.out.println(n +" is not a prime number");
        }
    }
}
