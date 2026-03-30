class Teacher{
    String name="Anitha";
}

class School{
    void teach(Teacher t){
        System.out.println(t.name+"teaches at school");
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        School s=new School();
        s.teach(t);
        System.out.println(t.name);
    }
}
