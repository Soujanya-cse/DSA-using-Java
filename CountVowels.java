public class CountVowels {
    public static void main(String[] args) {
        String str="aeoihgt";
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='e' ){
                count++;
            }
        }
        System.out.println("Count:"+count);
    }
}
