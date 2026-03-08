import java.util.*;

class PrefixSumHashMap {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 20, 10, 50, 40, 30, 10 };
        int target = 50;

        // HashMap<Integer,Integer> h=new HashMap<>();
        // int sum=0;
        // int i=1;
        // h.put(0,0);
        // for(int x:a){
        // sum=sum+x;
        // h.put(i,sum);
        // i++;
        // }
        // System.out.println(Arrays.toString(a));
        // System.out.println(h);

        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int i = 1;
        h.put(0, 0);
        for (int x : a) {
            sum = sum + x;
            if (h.containsValue(sum - target)) {
                System.out.println("True");
                return;
            } else {
                h.put(i, sum);
            }
        }
        System.out.println("False");

    }
}
