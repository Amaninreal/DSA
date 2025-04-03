package com.code.dsa.DsaPractice.array;

public class SumOfDigits {
    public static int sumof(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println(sumof(number));
    }
}
