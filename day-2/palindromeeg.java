public class palindromeeg {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){ //-1 is used to get the last index of the string
            rev = rev + str.charAt(i); //charAt() is used to get the character at the specified index. we are adding the character to the rev string to get the reverse of the original string.
        }
        if(str.equals(rev)){ //equals() compares the value where == compares the memory location. 
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}