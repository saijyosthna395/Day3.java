import java.util.HashSet;
public class  HashSetExample {
    public static void main(String[] args) {
      HashSet<String>names=new HashSet<>();
        names.add("Sai");
        names.add("Chetan");
        names.add("Teju");
        names.add("Anjum");
        names.add("Sai");
        System.out.println("HashSet  :"+names);
        names.remove("Teju");
        System.out.println("Contains Chetan :"+names.contains("Chetan"));
        System.out.println("Size: "+names.size());
        System.out.println("Is Empty:"+names.isEmpty());
    }
}
