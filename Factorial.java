package Javabasicprogram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num to find factorial of it");
        int num=sc.nextInt();
        int fact=1;
        int count=1;
        while(count<=num){
            fact*=count;
            count++;
        }
        System.out.println(fact);
    }
}
