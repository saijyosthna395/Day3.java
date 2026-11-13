 interface animal2 {
    void sound();
}
class Dog implements animal2{
    public void sound()
    {
        System.out.println("Brak Brak");
    }
}
public class  Main4
 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
    
}
