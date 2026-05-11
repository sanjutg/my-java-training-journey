public class continueStatement {
    public static void main(String[] args) {
        // for (int i = 1; i <= 20; i++) {
        //     if (i % 2 == 0) { //if !=0 then it is for odd numbers...till the n value
        //         continue; // Skip the rest of the loop body for even numbers
        //     }
        //     System.out.println(i); // This will only print odd numbers
        // }



        int a = 3;
        int b = ++a*5/a-- + --a; // 4*5/4 + 2 = 7 (operator precedence: pre increment and pre decrement have higher precedence than post decrement)
        // so ++a = 4; a-- = 4 (but after this statement a will become 3); --a = 2 (because a is now 3, so it will be decremented first and then used in the expression)
        // therefore, b = 4*5/4 + 2 = 7 (4 is cancelled with 4 in the denominator, so it becomes 5 + 2 = 7)
       
       
       
       
        System.out.println(b);
        continueStatement obj = new continueStatement();
        obj.method1();
        obj.method2();
        obj.method3();
    }
    public void method1() {
        int x=1, y=2;
        boolean result = ++x == 2 || y++==2 && x++ ==2;
        System.out.println(result); // true (because ++x == 2 is true, so the rest of the expression is not evaluated due to short-circuiting in logical OR)
        System.out.println(x); // 2 (because ++x is evaluated first, so x becomes 2, and the rest of the expression is not evaluated due to short-circuiting in logical OR)
        System.out.println(y); // 2 (because y++ is not evaluated due to short-circuiting in logical OR, so y remains 2)
    }

    public void method2(){
        int num = 8;
        num ^=(3<<1);
        System.out.println(num); // 14 (because 3<<1 is 6, and 8 XOR 6 is 14)
    }
    public void method3(){
        int a = 7;
        int b = 5;
        int res = (a|b) & (~a);
        System.out.println(res); // 0 (because a|b is 7, and ~a is -8, so 7 & -8 is 0)
    }
}
//pre increment: ++a => a is incremented first and then used in the expression
//post increment: a++ => a is used in the expression first and then incremented
//pre decrement: --a => a is decremented first and then used in the expression
//post decrement: a-- => a is used in the expression first and then decremented