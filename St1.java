class Stud{
    private int studentID=0;
    void getter()
    {
        System.out.println(studentID);
    }
    void setter(int num)
    {
      studentID=num;
    }
}

public class St1 {
    public static void main(String[] args) {
        Stud s1=new Stud();
        s1.setter(1010);
        s1.getter();
    }
    
}
