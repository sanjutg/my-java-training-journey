import java.util.*;

public class arrayarrangement {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer> zero = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  = 0; i<n;i++ ){
            arr.add(sc.nextInt());
        }
        for(int i : arr){
            if(i>0){
                pos.add(i);
            }
            else if(i==0){
                zero.add(i);
            }
            else{
                neg.add(i);
            }
        }
        ArrayList <Integer> res = new ArrayList<>();
        Collections.sort(neg);
        res.addAll(neg);
        Collections.sort(zero);
        res.addAll(zero);
        Collections.sort(pos);
        res.addAll(pos);
        System.out.println(res);
    }
}
