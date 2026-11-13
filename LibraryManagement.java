import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.HashSet;
public class LibraryManagement {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    TreeMap<Integer,String>books=new TreeMap<>();
    TreeMap<String,String>history=new TreeMap<>();
    HashSet<Integer>uniqueids=new HashSet<>();
    ArrayList<String>issuedHistory=new ArrayList<>();
    int Bookid,studentid;
    String BookName,studentname,date,bookid;
    do{
    System.out.println("Enter the option to perfrom:");
    System.out.println("1.Add a new book");
    System.out.println("2.Display History");
    System.out.println("3.Issue a book");
    System.out.println("4.Return a book");
    System.out.println("5.Display all Books ");
    System.out.println("6.exit form the application ");
    System.out.println("Enter your choice:");
    int choice=sc.nextInt();
    if(choice==1)
    {
      //adding book-id,name
      System.out.println("Enter the Book ID:");
      Bookid=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the Book name:");
      BookName=sc.nextLine();
      books.put(Bookid,BookName);
    }
    else if(choice==2)
    {
      System.out.println(history);
    }
    else if(choice==3)
    {
      System.out.println("Enter the Book ID:");
      bookid=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the Book name:");
      BookName=sc.nextLine();
      System.out.println("Enter the Student Id:");
      studentid=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the student name:");
      studentname=sc.nextLine();
      System.out.println("enter date:");
      date=sc.nextLine();
      history.put("Bookid",bookid);
      history.put("BookName",BookName);
      history.put("StudentId",studentid);
      history.put("StudentName",studentname);
      history.put("Date",date);
    }
    else if(choice==3)
    {
    }
    else if(choice==4)
    {
      
    }
    else if (choice==5)
    {
      System.out.println(books);
    }
    else if(choice==6)
    {
        System.out.println("Byee Byee!!!");
    }
    else{
        System.out.println("Invalid Choice,please Try again!!");
    }
}
   }
}
