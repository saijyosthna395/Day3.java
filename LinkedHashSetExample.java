import java.util.LinkedHashSet;

public class LinkedHashSetExample {
     public static void main(String[] args) {
      LinkedHashSet<String>names=new LinkedHashSet<>();
        names.add("Sai");
        names.add("Chetan");
        names.add("Teju");
        names.add("Anjum");
        names.add("Sai");
        System.out.println("LinkedHashSet  :"+names);
        names.remove("Teju");
        System.out.println("Contains Chetan :"+names.contains("Chetan"));
        System.out.println("Size: "+names.size());
        System.out.println("Is Empty:"+names.isEmpty());
    }
}


