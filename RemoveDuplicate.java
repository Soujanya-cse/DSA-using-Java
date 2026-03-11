import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        HashMap<Character,Integer> h=new HashMap<>();
        String s="abcadc";
        String str="";

        for(int i=0;i<s.length();i++){
            if(!h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),1);
                
                str=str+s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
