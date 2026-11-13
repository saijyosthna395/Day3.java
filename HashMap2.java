import java.util.HashMap;
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String>student=new HashMap<>();
        student.put(101,"sai");
        student.put(102,"chetan");
        student.put(103,"teju");
        student.put(104,"jehan");
        student.put(105,"sasi");
        System.out.println("All students Records:"+student);
        System.out.println("Name of id 102:"+student.get(102));
        student.put(103,"geetha");
        System.out.println("after updating :"+student);
        student.remove(105);
        System.out.println("After removing id 105:"+student);
        System.out.println("does id 101 exists?:"+student.containsKey(101));
        System.out.println("Does name jehan exists?:"+student.containsValue("jehan"));
        System.out.println("All students ids:"+student.keySet());
        System.out.println("All students name:"+student.values());
    }
}
