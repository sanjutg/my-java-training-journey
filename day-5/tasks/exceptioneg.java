// package tasks;
// public class exceptioneg {
//  public static void main(String[] args) {
//     String [] arr = new String[5];
//     try{
//         System.out.println(arr[10]); //shows array index out of bounds exception.
//     }
//     catch(Exception e){
//         System.out.println(e.getMessage()); // prints the message associated with the exception
//         //e.printStackTrace(); -> prints the complete stack trace of the exception
//         //System.out.println(e); -> prints the type of exception and the message
//     }
//     String s = "Hello"; //null 
//     try{
//         System.out.println(s.length()); // this will throw NullPointerException because we are trying to call a method on a null reference
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
//     int a = 10;
//     int b = 0;
//     try{
//         System.out.println(a/b); // this will throw ArithmeticException because we cannot divide by zero
//     }
//     catch(ArithmeticException e){
//         System.out.println("Cannot divide by zero");
//     }
//     catch(Exception e){
//         System.out.println(e);
//  }   
//  finally{
//     System.out.println("This block will always execute regardless of whether an exception occurred or not.");
//     System.out.println("all the errors were displayed and handled successfully.");
// }
// }
// }
// // //************************************************************************************************************************* */
// // //one try can have many catch blocks but only one finally block. 
// // //catch blocks cannot come without a try block but finally block can come with or without a catch block.
// // // try block cannot come without a catch block or finally block.
// // //types of exceptions: checked and unchecked exceptions.
// // //checked exceptions are those that are checked at compile time and must be handled using try-catch
// // //unchecked exceptions are those that are not checked at compile time and can be handled using try-catch but it is not mandatory to handle them.
// // //examples of checked exceptions: IOException, SQLException, ClassNotFoundException
// // //examples of unchecked exceptions: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException

// // //*************************************************************************************************************************


// // // static variables belongs to the class and are shared among all instances of the class. They can be accessed using the class name without creating an object of the class.
// // //Car c1 = new Car();
// // // public void display() is an instance method and can be accessed using the object reference variable c1.display();
// // //Car is class and c1 is object reference variable.
// // // Static members can be accessed without creating an object of the class but instance members cannot be accessed without creating an object of the class. 
// // // Static members can be accessed using the class name but instance members can be accessed using the object reference variable. 

