package Javabasicprogram;

import java.util.Scanner;

public class Sum_Of_All {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the num");
            int num=sc.nextInt();
            int sum=0;
            while(num!=0) {
                sum = sum + num;

                System.out.println("enter the num");
                num = sc.nextInt();

                if(num==0){
                    System.out.println(sum);
                }
            }

    }
}
