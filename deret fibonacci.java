package rpl;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Rpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int x = 2; x < n; x++) {
            fib[x] = fib[x-1] + fib[x-2];
        }
         
        for (int x = 0; x < n; x++) {
            System.out.print(fib[i] +  " ");
        }
    }
    
}
