// import java.util.*; 
// public class stringComp {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner (System.in);
//         System.out.println("Enter a string"); 
//         int count = 0;     
//         int i = 0, j = 0; 
//         char ch = ' ';
//         String str = sc.nextLine();
//         for(i=0; i<str.length();i++){
//              ch = str.charAt(i);
//             for( j = 0; j<str.length();j++){
//                 if(ch == str.charAt(j)){
//                     count++;
//                 }
//             }
//         //    if(ch == str.charAt(i)){
//         //     System.out.print(str.charAt(i)+ "" +count);
//         //    }
//         }
//         if(ch == str.charAt(i)){
//             System.out.print(str.charAt(i)+ "" +count);
//            }
        
//     }
// }
import java.util.*; 
public class stringComp {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter a string"); 
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(str.charAt(i) + "" + count);
     
     sc.close();
    }
}
}