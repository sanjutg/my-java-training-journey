public class exceptionInRev {
    public static void main(String[] args) {
        int num = 1;
        String s = "null";
        try{
            num = s.length();
            //num + = 2; // This line will not execute because an exception will be thrown in the previous line when trying to get the length of a null string.
        }
        catch(RuntimeException e){
            num += 4;
        }
        System.out.println(num); // This will print 5, because the catch block will be executed when the exception is thrown.
    }
}