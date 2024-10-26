package at.altin.strukturierteprogrammierung.self_study_g_arrays_and_functions.arrays2;

import java.util.Scanner;

public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf(": ");
        int n = sc.nextInt();
        if(n<=1)
            return; //there are no primes
        if(n==2)
            System.out.printf("2\n"); //trivial case

        boolean[] isPrime = new boolean[n+1];
        for(int i=2; i<=n; i++) {
            isPrime[i] = true; //we assume they are all primes, except 0 and 1
        }

        int cnt = 1;
        for (int p=2; p<=n; p++) {
            if(isPrime[p]) {
                System.out.printf("%d ", p);
                if (cnt % 10 == 0) {
                    System.out.printf("\n");
                    cnt++;
                }
                //erase all multiples from candidate list
                for(int j=p; j<=n; j+=p)
                {
                    isPrime[j]=false;
                }
            }
        }

        sc.close();
    }
}

