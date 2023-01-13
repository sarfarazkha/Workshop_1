package com.bridgelabz;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 12345, reverseNum = 0;

        while (num!= 0){
            int reminder = num%10;
            reverseNum = (reverseNum*10) + reminder;
            num /= 10;
        }
        System.out.println("Reversed number is" + reverseNum);
    }
}