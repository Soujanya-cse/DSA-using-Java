import java.util.*;
class ListArray{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        
        System.out.println(a.get(1));

        a.add(1,200);
        System.out.println(a);

        a.set(1,300);
        System.out.println(a);
        
        if(a.contains(50))
            System.out.println("true");

        a.remove(1);
        System.out.println(a);

        System.out.println(a.indexOf(20));

        System.out.println(a.size());
        
    }
}