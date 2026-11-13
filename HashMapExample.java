import java .util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String>students=new HashMap<>();
        students.put(101,"Sai");
        students.put(102,"Chetan");
        students.put(103,"Teju");
        students.put(104,"Jehan");
        System.out.println("Hashmap:"+students);
        System.out.println("Student 101 :"+students.get(101));
        students.put(102,"Chaituu");
        students.remove(103);
        System.out.println("Contains key 101:"+students.containsKey(101));
        System.out.println("Contains values Sai:"+students.containsValue("Sai"));
        System.out.println("Size:"+students.size());
    }
    
}
