package com.company;
import java.util.Scanner();
public class Main {
Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input a number (1/0) for input A: ");
        int userinputA = input.nextInt();
        System.out.println("Please input a number (1/0) for input B: ");
        int userinputB = input.nextInt();
        if (userinputA == 1 & userinputB == 1){
            System.out.println("Output from NOR gate is 0 ");
            System.out.println("Output from OR gate is 1 ");
            System.out.println("Output from AND gate is 0 ");
            System.out.println("Output from NOT gate is 1 ");
        }
        if (userinputA == 0 & userinputB == 0){
            System.out.println("Output from NOR gate is 0 ");
            System.out.println("Output from OR gate is 0 ");
            System.out.println("Output from AND gate is 0 ");
            System.out.println("Output from NOT gate is 1 ");
        }
        if (userinputA == 0 & userinputB == 1){
            System.out.println("Output from NOR gate is 1 ");
            System.out.println("Output from OR gate is 1 ");
            System.out.println("Output from AND gate is 1 ");
            System.out.println("Output from NOT gate is 0 ");
        }
        if (user)
    }
}
