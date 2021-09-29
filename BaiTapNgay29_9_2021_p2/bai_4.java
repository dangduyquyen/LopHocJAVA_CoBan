/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay29_9_2021_p2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 5 số: ");
        System.out.print("Nhập số thứ nhất: ");
        int so1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int so2 = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int so3 = sc.nextInt();
        System.out.print("Nhập số thứ bốnt: ");
        int so4 = sc.nextInt();
        System.out.print("Nhập số thứ năm: ");
        int so5 = sc.nextInt();
        long Sum = ( so1 + so2 + so3 + so4 + so5);
        double average = (Sum/5);
        System.out.println("Tổng là:" + Sum);
        System.out.println("Tổng là:" + average);
        
    }
}
