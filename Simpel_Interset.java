package Javabasicprogram;

import java.util.Scanner;

public class Simpel_Interset{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount ");
        Float pa=sc.nextFloat();
        System.out.println("enter the rate of interest");
        Float r=sc.nextFloat();
        System.out.println("enter the time");
        Float t=sc.nextFloat();
        Float si=pa*r*t;
        System.out.println(si);
    }
}
