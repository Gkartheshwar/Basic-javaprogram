package Javabasicprogram;

import java.util.Scanner;

public class Rs_Dollars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float Rs=sc.nextFloat();
        float rate=61.06f;
        float dollars;
        dollars=Rs/rate;
        System.out.println(dollars);
    }
}
