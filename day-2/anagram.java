import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char [] a1 = s1.toCharArray(); //toCharArray() is used to convert the string into a character array. it returns a new character array containing the characters of the string.
        char [] a2 = s2.toCharArray();
    Arrays.sort(a1); //sort() is used to sort the character array in ascending order. it is a static method of the Arrays class.
    Arrays.sort(a2);
    if(Arrays.equals(a1, a2)){ //equals() is used to compare the two character arrays. it returns true if the two arrays are equal, otherwise it returns false.
        System.out.println("Anagram");
    } else {
        System.out.println("Not an Anagram");
    }
    }
}
// anagram means two strings contains the same characters but in different order. for example, listen and silent are anagrams because they contain the same characters but in different order.
