import java.util.*;
public class HashmapBasic {
    public static void main(String[] args) {
        int[] a={10,10,10,20,10,30,50,40,20,10,60,50,40,10,20,10};
        HashMap<Integer,Integer> h=new HashMap<>();
        // h.put(1,10);
        // h.put(2,20);
        // h.put(3,30);
        // System.out.println(h);

        // System.out.println(h.get(1));

        // System.out.println(h.keySet());
        // System.out.println(h.values());

        // if(h.containsKey(1)){
        //     System.out.println("true");
        // }

        // for(int i:h.keySet()){
        //     System.out.println(i);
        // }

        for(int i:a){
            if(h.containsKey(i)){
                int count=h.get(i);
                count=count+1;
                h.put(i,count);
            }

            else{
                h.put(i,1);
            }
        }

        System.out.println(h);
    }
}
