package tasks;

public class seat {
    public static void main(String[] args) {
        int [] rowtnum = new int[]{1,2,3,4};
        int[] seatnum = new int[] {1,2,3};
        for(int i = 0; i < rowtnum.length; i++){
            for(int j = 0; j < seatnum.length; j++){
                System.out.println("Row " + rowtnum[i] + " Seat " + seatnum[j]);
            }
        }
    }
}
