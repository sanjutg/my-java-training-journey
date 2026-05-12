public class maxLen {
    public static void main(String[] args){
            int[] arr = {10,3, 2, 7, -1, -10, 11};
            int k = 15;
            int maxLength = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum == k) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
            
            
        System.out.println("Maximum length of subarray with sum " + k + " is: " + maxLength);
    }
}