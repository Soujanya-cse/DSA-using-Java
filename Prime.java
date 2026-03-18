public class Prime {
    public static void main(String[] args) {
        boolean isPrime=true;
        int n=6;

        if(n<=1){
            isPrime=false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break; //Very imporatant. It will exit from the current looping statement
            }
        }

        if(isPrime){
            System.out.println("It is prime number");
        }

        else{
            System.out.println("It is not prime numebr");
        }
    }
}
