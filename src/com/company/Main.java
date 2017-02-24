package com.company;

import java.util.Scanner;

public class Main {

            public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter in first number.");
                int a = in.nextInt();
                System.out.println("Enter in second number.");
                int b = in.nextInt();
                System.out.println(Recursive(a,b));


            }
            public static int Recursive(int a, int b){
                if(a==0)
                    return b;
                else if(b==0)
                    return a;
                else if(a==1||b==1)
                    return 1;
                else{
                    if(b>a) {
                        int rem = b % a;
                        return Recursive(a, rem);
                    }
                    if(a>b) {
                        int rem = a % b;
                        return Recursive(b, rem);
                    }
                }
                return Recursive(a,b);
            }
            public static int Iterative(int a, int b){


    }
}
