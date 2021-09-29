/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay29_9_2021_p1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên:");
        int so = sc.nextInt();
        int temp = so % 7 ;
        switch ( temp ) {
            case  0 -> System.out.println("Monday");
            case  1 -> System.out.println("Tuesday");
            case  2 -> System.out.println("Wednesday");
            case  3 -> System.out.println("Thursday");
            case  4 -> System.out.println("Friday");
            case  5 -> System.out.println("Saturday");
            case  6 -> System.out.println("Sunday");
            default -> {
            }
        }  
    }
}
