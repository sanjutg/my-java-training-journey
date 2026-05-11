public class frequency {
    public static void main(String[] args) {
        String str = "malayalam";
        boolean visited[] = new boolean[str.length()]; //boolean array is used to keep track of the visited characters in the string. it is initialized to false by default.
        for(int i=0; i<str.length(); i++){
            if(visited[i] == true){ //if the character is already visited, then we skip the iteration.
                continue;
            }
            int count = 1; //count is initialized to 1 because we are counting the current character as well.
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){ //if the characters are same, then we increment the count and mark the character as visited.
                    count++;
                    visited[j] = true; //marking the character as visited.
                }
            }
            System.out.println(str.charAt(i) + " " + count); //printing the character and its frequency.
        }
    }
}
// frequency means how many times a character is repeated in the string.
