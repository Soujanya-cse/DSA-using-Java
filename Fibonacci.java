import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fib0=0;
        int fib1=1;

       

        for(int i=0;i<=n;i++){
            System.out.print(fib0+" ");
            int fib=fib0+fib1;
            fib0=fib1;
            fib1=fib;
        }
        
    }
}
