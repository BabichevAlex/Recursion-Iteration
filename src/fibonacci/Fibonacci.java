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
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            // Thread.sleep(1);
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    private static long fibonacciTail(int n) {
        if (n == 0)
            return 0;
        return fibHelper(n, 1, 0, 1);
    }

    private static long fibHelper(int n, int m, long fibM_minus_one, long fibM) {
        if (n == m)
            return fibM;
        return fibHelper(n, m + 1, fibM, fibM_minus_one + fibM);
    }
    
}
