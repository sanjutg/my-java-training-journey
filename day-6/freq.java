
// import java.util.*;
// public class freq {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int count = 0;
//         for(int i = 0; i < s.length(); i++){
//             int freq = 0;
//             for(int j = 0; j < s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     freq++;
//                 }
//             }
//             if(freq > 1){
//                 count++;
//                 while(i + 1 < s.length() &&
//                       s.charAt(i) == s.charAt(i + 1)){
//                     i++;
//                 }
//             }
//         }

//         if(count == 0){
//             System.out.println(-1);
//         }
//         else{
//             System.out.println(count);
//         }
//     }
// }

import java.util.*;
public class freq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            int free = 0;
            for(int j = 0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    free++;
                }
            }
            if(free>1){
                count++;
                while(i+1 < s.length() && s.charAt(i)==s.charAt(i+1)){
                    i++;
                }
            }
        }
        if(count==0){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }
    }
}