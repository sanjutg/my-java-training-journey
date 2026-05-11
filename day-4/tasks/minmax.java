package tasks;

public class minmax {
    public static void main(String[] args) {
        int [] prices = new int[]{100, 200, 255, 300, 180, 400, 560, 320, 125, 275};
        int min = prices[0];
        int max = prices[0];
        for (int i= 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] > max){
                max = prices[i];
            }
        }
        for(int i = 0; i < prices.length; i++){
            System.out.println(" " + prices[i]);
        }
        System.out.println("Minimum Price: " + min);
        
        System.out.println("Maximum Price: " + max);
    }
}
