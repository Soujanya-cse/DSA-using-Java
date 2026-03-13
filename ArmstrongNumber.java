public class ArmstrongNumber {
    public static void main(String[] args) {
        // int n=153;
        // int temp=n;
        // int sum=0;

        // while(n!=0){
        //    int digit=n%10;
        //    sum=sum+(digit*digit*digit);
        //    n=n/10;
        // }
        // if(sum==temp){
        //     System.out.println("It is armstrong number");
        // }
        // else{
        //     System.out.println("It is not armstrong number");
        // }

        for(int i=0;i<1000;i++){
            int n=i;
            int sum=0;
            while(n!=0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
            }
            

            if(i==sum){
                System.out.print(i+" ");
            }
            
        }
    }
}
