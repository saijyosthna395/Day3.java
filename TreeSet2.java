import java.util.TreeSet;
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer>marks=new TreeSet<>();
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);
        System.out.println("Marks in ascending oredr:"+marks);
        System.out.println("lowest marks:"+marks.first());
        System.out.println("highest marks:"+marks.last());
        marks.remove(65);
        System.out.println("After removing 65:"+marks);
        System.out.println("90 exists?:"+marks.contains(90));
        System.out.println("number of unique marks:"+marks.size());
    }
}
