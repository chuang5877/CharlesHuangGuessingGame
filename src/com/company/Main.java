package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessInt(5);
    }
        public static void guessInt(int n){
            Scanner in=new Scanner(System.in);
            System.out.print("Guess the number");
            int g=in.nextInt();
            while(!(g==n)) {
                System.out.print("Guess again");
                g = in.nextInt();
            }
            System.out.println("That's correct! The number is "+n);
        }
        public static void guessAI(){
            Scanner in=new Scanner(System.in);
            int g=0;
            g+=Math.floor(1+Math.random()*100);
            System.out.print("Is the number "+g+"?");
            String ans=in.nextLine();
            while(!(ans=="correct"){

            }
        }
}
