package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //guessInt(5);
        guessAI(1,100);
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
        public static void guessAI(int min,int max){
            int a=min;
            int b=max;
            int c=0;
            Scanner in=new Scanner(System.in);
            System.out.print("What's your name?");
            String n=in.nextLine();
            System.out.print("Hello "+n+", nice to meet you!"+'\n');
            int g=(a+b)/2;
            System.out.print(n+", is the number in your head "+g+"? Please tell me if my answer is 'too high,' 'too low,' or 'correct'");
            String ans=in.nextLine();
            c++;
            while(!(ans.equalsIgnoreCase("correct"))){
                if(ans.equalsIgnoreCase("too high")){
                    b=g;
                    g=(a+b)/2;
                }else if(ans.equalsIgnoreCase("too low")){
                    a=g;
                    g=(a+b)/2;
                }
                System.out.println(n+", is the number "+g+"?");
                ans=in.nextLine();
                c++;
            }
            if(c>1){
                System.out.println("It took me " + c + " guesses to find the number!");
            }else{
                System.out.println("It took me " + c + " guess to find the number!");
            }
        }
}
