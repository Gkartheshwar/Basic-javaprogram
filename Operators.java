package Javabasicprogram;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3;
        char op=sc.next().trim().charAt(0);
        if(op=='+'){
            num3=num1+num2;
            System.out.println(num3);
        }else if(op=='-'){
            num3=num1-num2;
            System.out.println(num3);
        }else if(op=='*'){
            num3=num1*num2;
            System.out.println(num3);
        }else if(op=='/'){
            num3=num1/num2;
            System.out.println(num3);
        }else if(op=='%'){
            num3=num1%num2;
            System.out.println(num3);
        }else{
            System.out.println("enter the corect operator");
        }

    }
}
