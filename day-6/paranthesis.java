// import java.util.*;

// public class paranthesis {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         Stack<Character> st = new Stack<>();
//         boolean balanced = true;
//         for(char ch : s.toCharArray()){
//             if(ch == '(' || ch == '{' || ch == '['){
//                 st.push(ch);
//             }
//             else{
//                 if(st.isEmpty()){
//                     balanced = false;
//                     break;
//                 }
//                 char top = st.pop();
//                 if((ch == ')' && top != '(') ||
//                    (ch == '}' && top != '{') ||
//                    (ch == ']' && top != '[')){

//                     balanced = false;
//                     break;
//                 }
//             }
//         }
//         if(!st.isEmpty()){
//             balanced = false;
//         }
//         if(balanced){
//             System.out.println("Balanced");
//         }
//         else{
//             System.out.println("Not Balanced");
//         }
//     }
// }


import java.util.*;
public class paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        Stack <Character> st = new Stack<>();
        boolean balanced = true;
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='[' ||ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    balanced = false;
                    break;
                }
                char top = st.pop();
                if(ch=='}' && top !='{' || ch==']' && top!='[' || ch==')' && top != '('){
                    balanced = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            balanced = false;
        }
        if(balanced){
            System.out.println("Balanced");
        }
else{
    System.out.println("Not Balanced");
}

    }
}
