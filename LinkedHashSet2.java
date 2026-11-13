import java.util.LinkedHashSet;
public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>empids=new LinkedHashSet<>();
        empids.add(101);
        empids.add(102);
        empids.add(103);
        empids.add(104);
        empids.add(105);
        empids.add(106);
        empids.add(107);
        empids.add(108);
        empids.add(109);
        empids.add(110);
        System.out.println("Try adding duplicate emplyoee ids-----");
        empids.add(102);
        empids.add(105);
        System.out.println("All employees ids:"+empids);
        System.out.println("does ID 105 exists?:"+empids.contains(105));
        empids.remove(103);
        System.out.println("after removing 1d 103:"+empids);
        System.out.println("Total number of employees:"+empids.size());
        System.out.println("is collection empty:"+empids.isEmpty());
    }
    
}
