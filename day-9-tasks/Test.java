// package day-9-tasks;

public class Test {
    public static void main(String[] args) {
        String test = "a";
for (; test.compareTo("aaa") == 0; test = test + "a") {
    System.out.print(test.length() + " ");
}
System.out.println(test); 

    }
}
