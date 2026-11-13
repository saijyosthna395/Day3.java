import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String>playList=new LinkedList<>();
        playList.add("emo emo ");
        playList.add("manasulo undi");
        playList.add("love song");
        playList.add("mandara mandar");
        playList.add("sami sami");
        System.out.println("All songs:"+playList);
        playList.addFirst("Remo");
        System.out.println("After adding at beginning:"+playList);
        playList.addLast("mr.prefect");
        System.out.println("After adding at ending: "+playList);
        playList.remove("manasulo undi");
        System.out.println("first song:"+playList.getFirst());
        System.out.println("Last Song :"+playList.getLast());
        System.out.println("Total number of songs:"+playList.size());
    }
    
}
