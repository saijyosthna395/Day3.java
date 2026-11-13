class GrandParent{
    void name()
    {
        System.out.println("This is Grand Parent");
    }
}
class Parent extends GrandParent{
    Parent()
    {
        System.out.println("This is parent");
    }
}
class Child1 extends Parent{
    Child1()
    {
        System.out.println("This is child1");
    }
}
class Child2 extends Parent{
    Child2()
    {
        System.out.println("This is Child2");
    }
}public class Hybrid {
   public static void main(String[] args) {
     Child ch=new Child();
     ch.name();
    }   
}
