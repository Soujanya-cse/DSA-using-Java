public class LargestElement {
    public static void main(String[] args) {
        int[] a={1,2,5,3,6};
        int max=a[0];

        for(int i=0;i<=a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
