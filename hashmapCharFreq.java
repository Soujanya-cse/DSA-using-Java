import java.util.HashMap;
public class hashmapCharFreq {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();

        String s="apple";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }

            else{
                map.put(c,1);
            }
        }

        System.out.println("Frequency:"+map);
    }
    
}
