/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author 1710502
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        //int n = Integer.parseInt(args[0]);
        System.out.println("\n Value of n : " + n);
        System.out.println("\n Using Iteration : ");
        long l1 = System.nanoTime();
        fibonacciIterative(n);
        long l2 = System.nanoTime();
        System.out.println("iterative time = " + (l2 - l1));
        System.out.println(fibonacciIterative(n));

        System.out.println("\n Using Tail recursion : ");
        long l3 = System.nanoTime();
        fibonacciTail(n);
        long l4 = System.nanoTime();
        System.out.println("Tail recursive time = " + (l4 - l3));
        System.out.println(fibonacciTail(n));
        // TODO code application logic here
    }
    private static long fibonacciIterative(int n) throws InterruptedException {

        long a = 0, b = 1;
        
        for (int i = 1; i < n; ++i) {
            long t = b;
            b += a;
            a = t;
        }
        return b;
    }

    private static long fibonacciTail(int n) {
        return fibTailHelper(n, 0, 1);
    }

    private static long fibTailHelper(int n, long a, long b) {
        if (n == 1)
            return b;
        return fibTailHelper(n-1, b, a + b);
    }
    
}
