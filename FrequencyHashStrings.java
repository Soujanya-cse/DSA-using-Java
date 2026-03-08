import java.util.*;
public class FrequencyHashStrings {
    public static void main(String[] args) {
        String a="pavan prakash";
        // System.out.println(a.length());

        // for(char i:a.toCharArray()){
        //     System.out.println(i);
        // }

        HashMap<String,Integer> h=new HashMap<>();

        for(char x:a.toCharArray()){
            String i=Character.toString(x);

            if(h.containsKey(i)){
                int count=0;
                count=h.get(i);
                count++;
                h.put(i,count);
            }
            else{
                h.put(i,1);
            }
        }
        System.out.println(h);
    }
}
