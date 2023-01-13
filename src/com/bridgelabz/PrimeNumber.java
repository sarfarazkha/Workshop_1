package com.bridgelabz;

public class PrimeNumber {

    static boolean isPrime (int n){
        int count = 0;
        // checkng negative number is not prime
        if(n<2)
            return false;
        //checking number is divisible between 1 and n-1
        for(int i = 2; i<n; i++){
            if (n%1 == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int lower = 1, upper = 20;
        for (int i = lower; i<=upper; i++)
            if (isPrime(i))
                System.out.println(i);


    }
}
