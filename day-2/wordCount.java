public class wordCount {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        str = str.trim(); //trim() is used to remove the leading and trailing spaces from the string.
        String [] str2 = str.split(" "); //split() is used to split the string
    
        System.out.println("Number of words in the string: " + str2.length); 
}
}
















 // \\s+ is used to split the string by one or more spaces. it is a regular expression that matches one or more whitespace characters.
        // the + is used to match one or more occurrences of the preceding character or group. in this case, it matches one or more spaces.
        // \\w+ is used to split the string by one or more word characters. 
        // \\D+ is used to split the string by one or more non-digit characters. not(0-9)
        // \\d+ is used to split the string by one or more digit characters. (0-9)