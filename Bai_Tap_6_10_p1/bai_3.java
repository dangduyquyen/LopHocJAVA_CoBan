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
public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số: ");
        int so = sc.nextInt();
        int dem = 0;
        for(int i = 1; i <= so; i++){
            dem += i;
        }
        System.out.println("Tổng các số từ 1 đến số đã nhập là: " + dem );
        
    }
}
