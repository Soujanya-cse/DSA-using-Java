import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String a="ccbabacc";
    HashSet<Character> s=new HashSet<>();
    String result="";

    for(char i:a.toCharArray()){
        // String i=Character.toString(x);

        if(!s.contains(i)){
            s.add(i);
            result=result+i;
        }
    }
    System.out.println(result);
    
    }

}
