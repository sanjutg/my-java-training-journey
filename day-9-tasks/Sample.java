import java.util.*;

public class Sample {
    public static void main(String[] args) {
        List <String>  names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.remove(0);
        names.remove(0);
        System.out.println(names.isEmpty());
        names.add("Alice");
        names.add("Bob");
        names.clear();
        System.out.println(names.isEmpty());
            }
        }
    

