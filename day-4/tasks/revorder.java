package tasks;

public class revorder {
    public static void main(String[] args) {
        
    int [] numbers = new int[]{101, 102, 133, 144, 115, 106, 127, 138, 149, 110};
    System.out.println("Numbers in original order: ");
    for(int i = 0; i< numbers.length;i++){
        System.out.print(numbers[i] + " ");
    }
    System.out.println();
    System.out.println("Numbers in reverse order: ");
    for(int i = numbers.length - 1; i >= 0; i--){
        System.out.print(numbers[i] + " ");
    }   
}
}