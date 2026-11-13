import java.util.LinkedHashSet;
public class LinkedHashSet3 {
    public static void main(String[] args) {
    LinkedHashSet<String>products=new LinkedHashSet<>();
    products.add("Laptop");
    products.add("Mobile");
    products.add("Headphones");
    products.add("Smart Watch");
    System.out.println("Adding Laptop Again:");
    products.add("Laptop");
    System.out.println("All products:"+products);
    products.remove("Headphones");
    System.out.println("After removing Headphones:"+products);
    products.add("Tablets");
    System.out.println("Afetr adding tablets:"+products);
    System.out.println("Moblie is exists?:"+products.contains("Mobile"));
    System.out.println("Final products list:"+products);
    }
}
