import java.util.*;

public class arrayListMethods {
    public static void main(String[] args){
    ArrayList <String> list = new ArrayList<>();
    // methods
    list.add(0, "sweet lime");
    list.add(1,"apple");
    list.add(2, "banana");
    list.add(3,"musk melon");
    list.add(4, "tangerines");
    System.out.println(list);
    list.get(0);
    list.set(1,"custard apple");
        System.out.println("list after changes\n"+ list);



    }
}