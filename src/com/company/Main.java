package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i==1){
                System.out.println(i + " is not a prime number.");
            } else if (i/1==i && i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.println(i + " is a prime number.");
            } else if (i==2 || i==3 || i==5 || i==7){
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}
