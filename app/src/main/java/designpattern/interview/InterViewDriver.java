package designpattern.interview;

/**
 * @Author: Archana Kumari
 * @Date: 27-02-2023
 */
public class InterViewDriver {
    public static void main(String args[]) {
        // 0 1 1 2 3 5 8 13...


        int prev = 0, next = 1;
        int sum = 0;
        System.out.print(prev);
        System.out.print(next);
        // 0 1

       // 2-9
    }
    static int  term = 2;
    static void fib( int prev, int next, int sum){
        if(term == 9){
           return;
        }
        sum = prev + next;
        term++;
        System.out.print(sum);
        prev = next;
        next = sum;
     //  sum =  sum + fib(prev, next, sum);

    }
}
