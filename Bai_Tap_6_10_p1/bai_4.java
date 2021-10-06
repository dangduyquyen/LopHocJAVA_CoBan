/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_6_10_p1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số: ");
        int so = sc.nextInt();
        int dem = 0;
        while(so>0){
            dem++;
            so /= 10;
        }
        System.out.println("Số đã nhập có: " + dem + " chữ số.");
    }    
}
