/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay29_9_2021_p3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int so = sc.nextInt();
        int sso = so;
        int temp; int tong = 0;
        while(so>0){
            temp = so%10;
            tong += temp;
            so /= 10;
        }
        System.out.println("The sum of all digits in " + sso + " is " + tong );
    }
}
